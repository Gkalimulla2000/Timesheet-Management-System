package com.timesheet.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.timesheet.entity.Employee;



public interface EmployeeRepository extends CrudRepository<Employee,Long>{
	

	
	
}
