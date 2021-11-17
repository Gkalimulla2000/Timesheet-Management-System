package com.timesheet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.EmployeeRepository;
import com.timesheet.dao.LeaveRepository;
import com.timesheet.entity.Employee;
import com.timesheet.entity.Leave;
import com.timesheet.entity.Roles;

@Service
public class EmloyeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private LeaveRepository leaveRepository;

	Employee employee = new Employee();

	@Override
	public ArrayList<Employee> getAllEmps() {

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

		employeeRepository.save(emp);

	}

	@Override
	public void changePassword(String empPassword, Long empId) {

		Employee emp = employeeRepository.findById(empId).get();
		emp.setEmpPassword(empPassword);
		employeeRepository.save(emp);

	}

	@Override
	public List<Leave> getLeave() {

		return (List<Leave>) leaveRepository.findAll();
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

		employeeRepository.deleteById(empId);
	}

	@Override
	public void updateRole(Roles role, Long empId) {
		Employee emp = employeeRepository.findById(empId).get();
		emp.setRole(role);
		employeeRepository.save(emp);

	}

}
