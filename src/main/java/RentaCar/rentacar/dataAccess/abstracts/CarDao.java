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
	/*@Query("Select new RentaCar.rentacar.entities.dtos.CarWithBrandsDto"
		  		+ "(p.carId, c.brandName, p.description,p.dailyPrice,b.colorName) "
		  		+ "From RentaCar.rentacar.entities.concrete.Brands c Inner Join c.cars p Inner Join c.car b")*/
	@Query("Select new RentaCar.rentacar.entities.dtos.CarWithBrandsDto"
	  		+ "(c.carId, m.brandName, c.description,c.dailyPrice,n.colorName,c.carName) "
	  		+ "From RentaCar.rentacar.entities.concrete.Car c Join c.brand m Join c.color n WHERE n.colorId=:colorId")
	  List<RentaCar.rentacar.entities.dtos.CarWithBrandsDto> getByColorId(int colorId);
	
	@Query("Select new RentaCar.rentacar.entities.dtos.CarWithBrandsDto"
	  		+ "(c.carId, m.brandName, c.description,c.dailyPrice,n.colorName,c.carName) "
	  		+ "From RentaCar.rentacar.entities.concrete.Car c Join c.brand m Join c.color n WHERE m.brandId=:brandId")
	  List<RentaCar.rentacar.entities.dtos.CarWithBrandsDto> getByBrandId(int brandId);
	
	  @Query("Select new RentaCar.rentacar.entities.dtos.CarWithBrandsDto"
		  		+ "(c.carId, m.brandName, c.description,c.dailyPrice,n.colorName,c.carName) "
		  		+ "From RentaCar.rentacar.entities.concrete.Car c Join c.brand m Join c.color n")
	  List<CarWithBrandsDto> getCarWithBrandsDetails();
	
}
	  
	  

