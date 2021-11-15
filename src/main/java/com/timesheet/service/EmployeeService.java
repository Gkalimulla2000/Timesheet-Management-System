package com.timesheet.service;

import java.util.ArrayList;
import java.util.List;

import com.timesheet.entity.Employee;



public interface EmployeeService {
	public ArrayList<Employee> getAllEmps();
	public void insertEmp(Employee e);
	public Employee getEmpById(Long empId);
	public void updateEmp(Employee emp);
	public void changePassword(String empPassword, Long empId);
	public List<Employee> getLeave();
	public List<Employee> getMonthLeaveReport();
	public void deleteAllEmployees();
	public void deleteEmployeeByID(Long id);
	
}
