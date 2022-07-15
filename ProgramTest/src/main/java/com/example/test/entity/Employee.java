package com.example.test.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	@NotBlank
	private String name;
	
	@Column(name="username",unique = true)
	private String username;
	
	@Email
	@Column(name="email",unique = true)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Address address;
	
	
	@Column(name="phone",unique = true)
	private String phone;
	
	@Column(name="website")
	@NotBlank
	private String website;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinColumn(name = "emp_id")
	private Company company;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, String username, @Email String email, Address address, String phone,
			String website, Company company) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.company = company;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", address="
				+ address + ", phone=" + phone + ", website=" + website + ", company=" + company + "]";
	}
	
	

}
