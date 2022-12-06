package RentaCar.rentacar.business.abstracts;

import java.util.List;

import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;

import RentaCar.rentacar.entities.concrete.Car;



public interface CarService {

	DataResult<List<Car>> getAll();

	Result add(Car car);
	DataResult<Car> getByColorId(int colorId);
	DataResult<Car> getByBrandId(int brandId);
}
