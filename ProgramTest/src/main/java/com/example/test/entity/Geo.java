package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Geo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	private String lat;
	
	@NotBlank
	private String lng;
	public Geo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Geo(Integer id, String lat, String lng) {
		super();
		this.id = id;
		this.lat = lat;
		this.lng = lng;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "Geo [id=" + id + ", lat=" + lat + ", lng=" + lng + "]";
	}
	
	
}
