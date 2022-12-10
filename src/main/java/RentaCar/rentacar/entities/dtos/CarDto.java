package RentaCar.rentacar.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CarDto {

	private int carId;
	private String carName;
	private int brandId;
	private String BrandName;
	
}
