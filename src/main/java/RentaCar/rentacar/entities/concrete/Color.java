package RentaCar.rentacar.entities.concrete;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Colors")
public class Color {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//1 1 arttirir
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	public Color() {}
	public Color(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}
