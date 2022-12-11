package RentaCar.rentacar.entities.concrete;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="brands")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","cars"})
public class Brands {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//1 1 arttirir
	@Column(name="brand_id")
	private int brandId;
	
	@Column(name="brand_name")
	private String brandName;

	

	
	/*@OneToMany(mappedBy = "brand")
	 private List<Car> cars;*/
	
	

	
}
