package com.example.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entity.Employee;
import com.example.test.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void saveEmployeeDetails(Employee employee) {
		employeeRepository.save(employee);
	}
	
	

}
