package RentaCar.rentacar.entities.concrete;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cars")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//1 1 arttirir
	@Column(name="id")
	private int id;
	
	@Column(name="brand_id")
	private int brandId;
	
	@Column(name="color_id")
	private int colorId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="model_year")
	private String modelYear;

	public Car() {}
	public Car(int id, int brandId, int colorId, String name, String description, String modelYear) {
		super();
		this.id = id;
		this.brandId = brandId;
		this.colorId = colorId;
		this.name = name;
		this.description = description;
		this.modelYear = modelYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getColorId() {
		return colorId;
	}
	public void setColorId(int colorId) {
		this.colorId = colorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	
	
	
}
