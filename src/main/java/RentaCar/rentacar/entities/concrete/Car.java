package RentaCar.rentacar.entities.concrete;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//1 1 arttirir
	@Column(name="car_id")
	private int carId;
	
	/*@Column(name="brand_id")
	private int brandId;*/
	
	/*@Column(name="color_id")
	private int colorId;*/
	
	@Column(name="car_name")
	private String carName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="model_year")
	private String modelYear;
   
	@Column(name="daily_price")
	private int dailyPrice;

	
	@ManyToOne()
	@JoinColumn(name="brand_id")//categoryId tutmamıza gerek yok yukarıda bu sayede
	private Brands brand;
	
	@ManyToOne()
	@JoinColumn(name="color_id")//categoryId tutmamıza gerek yok yukarıda bu sayede
	private Color color;
	
	
	
}
