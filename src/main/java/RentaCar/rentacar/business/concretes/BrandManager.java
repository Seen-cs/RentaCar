package RentaCar.rentacar.business.concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RentaCar.rentacar.business.abstracts.BrandService;

import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;
import RentaCar.rentacar.core.utilities.results.SuccessDataResult;
import RentaCar.rentacar.core.utilities.results.SuccessResult;
import RentaCar.rentacar.dataAccess.abstracts.BrandDao;
import RentaCar.rentacar.entities.concrete.Brands;



@Service
public class BrandManager implements BrandService {

	private BrandDao brandDao;
	@Autowired
	public BrandManager(BrandDao brandDao) {
		super();
		this.brandDao = brandDao;
	}

	

	@Override
	public DataResult<List<Brands>> getAll() {
		
		return new SuccessDataResult<List<Brands>>(this.brandDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(Brands brands) {
		this.brandDao.save(brands);
		return new SuccessResult("Ürün eklendi");
	}



	
	
}
