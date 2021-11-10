package com.timesheet.service;

import java.util.ArrayList;

import com.timesheet.entity.Employee;



public interface EmployeeService {
	public ArrayList<Employee> getAllEmps();
	public void insertEmp(Employee e);
	public void updateEmp(Employee emp);
	public void changePassword(String empPassword, Long empId);
}
