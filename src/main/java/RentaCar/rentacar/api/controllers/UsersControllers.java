package RentaCar.rentacar.api.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import RentaCar.rentacar.business.abstracts.UserService;
import RentaCar.rentacar.core.entities.User;
import RentaCar.rentacar.core.utilities.results.ErrorDataResult;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UsersControllers {

	private UserService userService;
	
	
	@Autowired
	public UsersControllers(UserService userService) {
		super();
		this.userService = userService;
	}
	@PostMapping("/add")//@valid demek validasyondan geçir demek
	public ResponseEntity<?> add(@Valid @RequestBody User user) {//? error veya result yani success de dönebilir
		
		return ResponseEntity.ok(this.userService.add(user)) ;
	}
	//her operasyonumuza try cache yazmak yerine bitane yazarız ex. handler ilk buradan geçer hata varmı yok mu diyye
	
	@ExceptionHandler(MethodArgumentNotValidException.class)//.nte te typeof()
	@ResponseStatus(HttpStatus.BAD_REQUEST)//500 dönsün
	public ErrorDataResult<Object> handleValidationException//genel veri tipi olarak object yazarıztüm calsların int boolen felan temeli object
	(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String, String>();//anahtar value map içi//dictinoary 
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors 
		= new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
		return errors;
	}
}
