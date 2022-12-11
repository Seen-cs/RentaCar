package RentaCar.rentacar.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class CarWithBrandsDto {

	private int CarId;
	private String brandName;
	private String description;
	private int dailyPrice;
	private String colorName;
}
