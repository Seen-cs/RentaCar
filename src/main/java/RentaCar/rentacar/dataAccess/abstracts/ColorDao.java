package RentaCar.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import RentaCar.rentacar.entities.concrete.Color;

public interface ColorDao extends JpaRepository<Color,Integer> {

	
}
