package RentaCar.rentacar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import RentaCar.rentacar.entities.concrete.Car;


public interface CarDao extends JpaRepository<Car,Integer> {

	Car getByColorId(int colorId);
	Car getByBrandId(int brandId);
}
