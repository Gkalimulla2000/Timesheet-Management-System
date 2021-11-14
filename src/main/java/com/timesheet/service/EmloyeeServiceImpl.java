package com.timesheet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.EmployeeRepository;
import com.timesheet.entity.Employee;
@Service
public class EmloyeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeRepository EmployeeRepository;

Employee employee=new Employee();
	@Override
	public ArrayList<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return (ArrayList<Employee>) EmployeeRepository.findAll();
	}

	@Override
	public void insertEmp(Employee e) {
		// TODO Auto-generated method stub
		
		EmployeeRepository.save(e);
	}

	@Override
	public void updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		EmployeeRepository.save(emp);
		
	}
	@Override
	public void changePassword(String empPassword, Long empId) {
		// TODO Auto-generated method stub
		Employee emp= EmployeeRepository.findById(empId).get();
		emp.setEmpPassword(empPassword);
		EmployeeRepository.save(emp);
	/*	for(Employee id:emp) {
			if(id.equals(empId)) {
				
				EmployeeRepository.changePassword(empPassword);
			}
		}  */
	}

	@Override
	public List<Employee> getLeave() {
		
		return null;
	}

	@Override
	public List<Employee> getMonthLeaveReport() {
		
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		
		EmployeeRepository.deleteAll(EmployeeRepository.findAll());
		
	}

	@Override
	public void deleteEmployeeByID(Long empId) {
		// TODO Auto-generated method stub
		
		EmployeeRepository.deleteById( empId);
	}
}
