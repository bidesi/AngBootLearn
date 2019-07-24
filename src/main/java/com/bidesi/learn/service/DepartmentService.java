package com.bidesi.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidesi.learn.entity.Department;
import com.bidesi.learn.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	public List<Department> departmentList() {
		return departmentRepository.findAll();
	}
	
	
	
}
