package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.example.test.entity.Employee;
import com.example.test.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/users")
	public void saveEmployeeDetails(@RequestBody Employee employee) {
		employeeService.saveEmployeeDetails(employee);
		System.out.println("Record Insertedd Successfully....");
	}
}
