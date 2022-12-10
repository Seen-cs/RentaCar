package RentaCar.rentacar.entities.concrete;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="brands")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","cars"})
public class Brands {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//1 1 arttirir
	@Column(name="brand_id")
	private int brandId;
	
	@Column(name="brand_name")
	private String brandName;

	

	
	@OneToMany(mappedBy = "brand")
	 private List<Car> cars;
	
}
