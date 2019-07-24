package com.bidesi.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidesi.learn.entity.Employee;
import com.bidesi.learn.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> employeeList() {
		return employeeRepository.findAll();
	}

}
