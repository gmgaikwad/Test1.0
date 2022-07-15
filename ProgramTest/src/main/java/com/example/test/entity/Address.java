package com.example.test.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	private String street;
	
	@NotBlank
	private String suite;
	
	@NotBlank
	private String city;
	
	@NotBlank
	private String zipcode;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Geo geo;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Integer id, String street, String suite, String city, String zipcode, Geo geo) {
		super();
		this.id = id;
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
		this.geo = geo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Geo getGeo() {
		return geo;
	}

	public void setGeo(Geo geo) {
		this.geo = geo;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", suite=" + suite + ", city=" + city + ", zipcode="
				+ zipcode + ", geo=" + geo + "]";
	}
	
	
}
