package com.bidesi.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidesi.learn.entity.Employee;
import com.bidesi.learn.service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> employee(){
		return employeeService.employeeList();
	}
}
