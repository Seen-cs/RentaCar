package RentaCar.rentacar.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import RentaCar.rentacar.business.abstracts.ColorService;
import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;
import RentaCar.rentacar.entities.concrete.Color;

@RestController
@RequestMapping("/api/colors")
public class ColorsControllers {

	private ColorService colorService;

	@Autowired
	public ColorsControllers(ColorService colorService) {
		super();
		this.colorService = colorService;
	}
	
	@GetMapping("/getall")//http["getall"] asp.nette//id ve colorname getirir
	 public DataResult<List<Color>> getAll(){
		 return  this.colorService.getAll();
	 }
	@PostMapping("/add")
	public Result add(@RequestBody Color color) {
		return this.colorService.add(color);
	}
	
	
}
