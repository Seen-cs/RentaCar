package RentaCar.rentacar.business.abstracts;

import java.util.List;



import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;
import RentaCar.rentacar.entities.concrete.Brands;





public interface BrandService {

	DataResult<List<Brands>> getAll();
	Result add(Brands brands);
	
	
}
