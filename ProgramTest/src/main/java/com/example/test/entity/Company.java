package com.example.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String catchPhrase;
	
	@NotBlank
	private String bs;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(Integer id, String name, String catchPhrase, String bs) {
		super();
		this.id = id;
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.bs = bs;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatchPhrase() {
		return catchPhrase;
	}
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	public String getBs() {
		return bs;
	}
	public void setBs(String bs) {
		this.bs = bs;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", catchPhrase=" + catchPhrase + ", bs=" + bs + "]";
	}
	
	
	
}
