package com.bidesi.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bidesi.learn.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>{
	
}
