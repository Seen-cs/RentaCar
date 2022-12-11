package RentaCar.rentacar.api.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import RentaCar.rentacar.business.abstracts.BrandService;
import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;
import RentaCar.rentacar.entities.concrete.Brands;




@RestController
@RequestMapping("/api/brands")
public class BrandsControllers {

	private BrandService brandService;

	@Autowired
	public BrandsControllers(BrandService brandService) {
		super();
		this.brandService = brandService;
	}
	
	
	@GetMapping("/getall")//brandId ve Brand Name getiriyor
	 public DataResult<List<Brands>> getAll(){
		 return  this.brandService.getAll();
	 }
	@PostMapping("/add")
	public Result add(@RequestBody Brands brands) {
		return this.brandService.add(brands);
	}
	
	
}
