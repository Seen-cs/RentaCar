package RentaCar.rentacar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RentaCar.rentacar.business.abstracts.ColorService;
import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;
import RentaCar.rentacar.core.utilities.results.SuccessDataResult;
import RentaCar.rentacar.core.utilities.results.SuccessResult;
import RentaCar.rentacar.dataAccess.abstracts.ColorDao;
import RentaCar.rentacar.entities.concrete.Color;

@Service
public class ColorManager implements ColorService {

	private ColorDao colorDao;
	@Autowired
	public ColorManager(ColorDao colorDao) {
		super();
		this.colorDao = colorDao;
	}

	@Override
	public DataResult<List<Color>> getAll() {
		return new SuccessDataResult<List<Color>>(this.colorDao.findAll(),"data listelendi");
		
	}

	@Override
	public Result add(Color color) {
		this.colorDao.save(color);
		return new SuccessResult("Ürün eklendi");
	}

	

}
