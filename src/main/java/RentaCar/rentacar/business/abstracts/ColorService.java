package RentaCar.rentacar.business.abstracts;

import java.util.List;

import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;
import RentaCar.rentacar.entities.concrete.Color;

public interface ColorService {
	
	
	DataResult<List<Color>> getAll();

	Result add(Color color);
}
