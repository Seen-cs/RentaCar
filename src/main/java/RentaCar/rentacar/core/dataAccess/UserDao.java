package RentaCar.rentacar.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import RentaCar.rentacar.core.entities.User;

public interface UserDao extends JpaRepository<User,Integer>{
		
	User findByEmail(String email);
}
