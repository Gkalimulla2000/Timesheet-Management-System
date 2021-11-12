package com.timesheet.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.timesheet.entity.Employee;



public interface EmployeeRepository extends CrudRepository<Employee,Long>{
	@Query("Select * from Employee e where e.empId='empid'")
	void changePassword(String empPassword);

	void deleteById(int empId);
	
}
