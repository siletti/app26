package com.siletti.springboot.app26.service;

import java.util.List;

import com.siletti.springboot.app26.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
