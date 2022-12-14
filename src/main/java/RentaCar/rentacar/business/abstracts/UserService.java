package RentaCar.rentacar.business.abstracts;

import RentaCar.rentacar.core.entities.User;
import RentaCar.rentacar.core.utilities.results.DataResult;
import RentaCar.rentacar.core.utilities.results.Result;

public interface UserService {

	Result add(User user);
	DataResult<User> findByEmail(String email);
}
