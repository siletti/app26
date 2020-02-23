package com.siletti.springboot.app26.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siletti.springboot.app26.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!

    public List<Employee> findAllByOrderByLastNameAsc();
	
}
