package RentaCar.rentacar.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import RentaCar.rentacar.entities.concrete.Car;
import RentaCar.rentacar.entities.dtos.CarWithBrandsDto;





public interface CarDao extends JpaRepository<Car,Integer> {

	//Car getByColorId(int colorId);
	//Car getByBrandId(int brandId);
	
	
	//@Query("Select new RentaCar.rentacar.entities.dtos.ProductWithCategoryDetails(p.id,p.description,c.name) from Brands c Inner Join c.cars p  ")
	//@Query("Select j.name b.name from RentaCar.rentacar.entities.concrete.Car j Join RentaCar.rentacar.entities.concrete.Brands b ")
	//List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
	  @Query("Select new RentaCar.rentacar.entities.dtos.CarWithBrandsDto"
		  		+ "(p.carId, c.brandName, p.description,p.dailyPrice) "
		  		+ "From RentaCar.rentacar.entities.concrete.Brands c Inner Join c.cars p ")
	List<CarWithBrandsDto> getCarWithBrandsDetails();
}
