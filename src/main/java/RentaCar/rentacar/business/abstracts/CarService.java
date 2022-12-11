package RentaCar.rentacar.business.abstracts;

import java.util.List;

import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;

import RentaCar.rentacar.entities.concrete.Car;
import RentaCar.rentacar.entities.dtos.CarWithBrandsDto;





public interface CarService {

	DataResult<List<Car>> getAll();

	Result add(Car car);
	
	DataResult<List<CarWithBrandsDto>> getCarWithBrandsDetails();
	
	DataResult<List<RentaCar.rentacar.entities.dtos.CarWithBrandsDto>> getByColorId(int colorId);
	DataResult<List<RentaCar.rentacar.entities.dtos.CarWithBrandsDto>> getByBrandId(int brandId);
}
