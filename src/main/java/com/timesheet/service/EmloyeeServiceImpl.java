package com.timesheet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.EmployeeRepository;
import com.timesheet.entity.Employee;

@Service
public class EmloyeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	Employee employee = new Employee();

	@Override
	public ArrayList<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return (ArrayList<Employee>) employeeRepository.findAll();
	}

	@Override
	public void insertEmp(Employee e) {

		employeeRepository.save(e);
	}

	@Override
	public Employee getEmpById(Long empId) {
		Optional<Employee> employee = employeeRepository.findById(empId);
	
		return employee.get();
	}

	@Override
	public void updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		employeeRepository.save(emp);

	}

	@Override
	public void changePassword(String empPassword, Long empId) {
		// TODO Auto-generated method stub
		Employee emp = employeeRepository.findById(empId).get();
		emp.setEmpPassword(empPassword);
		employeeRepository.save(emp);
		/*
		 * for(Employee id:emp) { if(id.equals(empId)) {
		 * 
		 * EmployeeRepository.changePassword(empPassword); } }
		 */
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

		employeeRepository.deleteAll(employeeRepository.findAll());

	}

	@Override
	public void deleteEmployeeByID(Long empId) {
		// TODO Auto-generated method stub

		employeeRepository.deleteById(empId);
	}

}
