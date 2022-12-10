package RentaCar.rentacar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RentaCar.rentacar.business.abstracts.CarService;
import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;
import RentaCar.rentacar.core.utilities.results.SuccessDataResult;
import RentaCar.rentacar.core.utilities.results.SuccessResult;
import RentaCar.rentacar.dataAccess.abstracts.CarDao;
import RentaCar.rentacar.entities.concrete.Car;
import RentaCar.rentacar.entities.dtos.CarWithBrandsDto;


@Service
public class CarManager implements CarService {

	private CarDao carDao;
	
	@Autowired
	public CarManager(CarDao carDao) {
		super();
		this.carDao = carDao;
	}

	@Override
	public DataResult<List<Car>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Car>>(this.carDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(Car car) {
		this.carDao.save(car);
		return new SuccessResult("Ürün eklendi");
	}

/*	@Override
	public DataResult<Car> getByColorId(int colorId) {
		return new SuccessDataResult<Car>(this.carDao.getByColorId(colorId),"data listelendi");
	}
*/
	/*@Override
	public DataResult<Car> getByBrandId(int brandId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Car>(this.carDao.getByBrandId(brandId),"data listelendi");
	}*/

	@Override
	public DataResult<List<CarWithBrandsDto>> getCarWithBrandsDetails() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CarWithBrandsDto>>(this.carDao.getCarWithBrandsDetails(),"data listelendi");
	}





	
}
