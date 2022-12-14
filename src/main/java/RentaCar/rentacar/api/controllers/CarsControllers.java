package RentaCar.rentacar.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import RentaCar.rentacar.business.abstracts.CarService;
import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;
import RentaCar.rentacar.entities.concrete.Car;

import RentaCar.rentacar.entities.dtos.CarWithBrandsDto;

@CrossOrigin
@RestController
@RequestMapping("/api/cars")
public class CarsControllers {

	private CarService carService;
	
	@Autowired
	public CarsControllers(CarService carService) {
		super();
		this.carService = carService;
	}
	
	@GetMapping("/getCarDetails")//http["getall"] asp.nette
	 public DataResult<List<Car>> getAll(){
		 return  this.carService.getAll();
	 }
	@PostMapping("/add")
	public Result add(@RequestBody Car car) {
		return this.carService.add(car);
	}
	
	@GetMapping("/getByColorId")
	public DataResult<List<RentaCar.rentacar.entities.dtos.CarWithBrandsDto>> getByColorId(@RequestParam int colorId){
		return this.carService.getByColorId(colorId);
	}
	
	@GetMapping("/getByBrandId")
	public DataResult<List<CarWithBrandsDto>> getByBrandId(@RequestParam int brandId) {
		return this.carService.getByBrandId(brandId);
	}

	/*@GetMapping("/getbycolorid")//Requestparam yapılan istekten istediğimizi parametreyi getirememiz yarar
	public DataResult<Car> getByColorId(@RequestParam int colorId) {
		return this.carService.getByColorId(colorId);
	}//getByBrandId*/
	
	/*@GetMapping("/getbybrandid")//Requestparam yapılan istekten istediğimizi parametreyi getirememiz yarar
	public DataResult<Car> getByBrandId(@RequestParam int brandId) {
		return this.carService.getByBrandId(brandId);
	}*/
	
	@GetMapping("/getCarWithBrandDetails")
	public DataResult<List<CarWithBrandsDto>> getCarWithBrandsDetails() {
	return this.carService.getCarWithBrandsDetails();
	}
	
}
