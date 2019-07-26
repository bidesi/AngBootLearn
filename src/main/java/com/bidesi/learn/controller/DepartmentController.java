package com.bidesi.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bidesi.learn.entity.Department;
import com.bidesi.learn.service.DepartmentService;

@CrossOrigin
@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/departments")
	public List<Department> department(){
		return departmentService.departmentList();
	}
}
