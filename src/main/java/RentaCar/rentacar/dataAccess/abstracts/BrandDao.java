package RentaCar.rentacar.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import RentaCar.rentacar.entities.concrete.Brands;




public interface BrandDao extends JpaRepository<Brands,Integer>{

	
	
}
