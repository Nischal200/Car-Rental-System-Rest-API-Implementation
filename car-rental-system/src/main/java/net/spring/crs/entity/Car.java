package net.spring.crs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity is a jpa annotation used to make a class a jpa entity
@Entity

/**
 * If @Table @Colum is not used to give the name of the field and table then JPA
 * uses the name of the class as table name and if uses the name of the field as
 * the column name
 **/

//Mapping class to a database table / Table name = cars

@Table(name = "cars")
public class Car {
	// Adding primay key for the table

	// Pk generated strategy
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Mapping colum names for the feilds
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "Wheels")
	private Long wheels = (long) 4;
	@Column(name = "passenger")
	public Long passenger;
	@Column(name = "owner")
	private String owner;

	public Car(Long id, String name, String type, Long wheels, String owner, Long passenger) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.wheels = wheels;
		this.owner = owner;
		this.passenger = passenger;
	}

	// Parameters constructor

	public Car(String name, String type, String owner, Long wheels, Long passengers) {
		super();
		this.name = name;
		this.type = type;
		this.owner = owner;
		this.wheels = wheels;
		this.passenger = passengers;

	}

	// Default constructer required by hibernate

	public Car() {

	}

	// Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPassengers() {
		return passenger;
	}

	public void setPassengers(Long passenger) {
		this.passenger = passenger;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getWheels() {
		return wheels;
	}

	public void setWheels(Long wheels) {
		this.wheels = wheels;
	}

	public String getOwner() {
		return owner;

	}

	public void setOwner(String owner) {

		this.owner = owner;
	}

}
