package com.tecsup.petclinic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "owners")
public class Owner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String name;
	
	@Column(name = "last_name")
	private String lastName;
	
	private String address;
	
	private String city;
	
	private String telephone;
	
	public Owner() {
		
	}
	
	public Owner(long id, String firstName, String lastName, String address, String city, String telephone) {
		super();
		this.id = id;
		this.name = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}
	
	public Owner( String firstName, String lastName, String address, String city, String telephone) {
		super();
		this.name = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", telephone=" + telephone + "]";
	}
	
	
}
