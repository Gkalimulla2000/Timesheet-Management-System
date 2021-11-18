package com.timesheet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.EmployeeRepository;
import com.timesheet.dao.LeaveRepository;
import com.timesheet.entity.Employee;
import com.timesheet.entity.Leave;
import com.timesheet.entity.Roles;
import com.timesheet.exception.NoEmployeeFoundException;

@Service
public class EmloyeeServiceImpl implements EmployeeService {
	public static final String NO_RECORD_FOUND = "No Record Found";
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private LeaveRepository leaveRepository;

	Employee employee = new Employee();

	@Override
	public List<Employee> getAllEmps() {

		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void insertEmp(Employee e) {

		employeeRepository.save(e);
	}

	@Override
	public Employee getEmpById(Long empId) {
		Optional<Employee> emp = employeeRepository.findById(empId);
		if (emp.isPresent()) {
			return emp.get();
		} else
			throw new NoEmployeeFoundException(NO_RECORD_FOUND);
	}

	@Override
	public void updateEmp(Employee emp) {

		employeeRepository.save(emp);

	}

	@Override
	public void changePassword(String empPassword, Long empId) {

		Optional<Employee> emp = employeeRepository.findById(empId);
		if (emp.isPresent()) {
			emp.get().setEmpPassword(empPassword);
			employeeRepository.save(emp.get());
		}

	}

	@Override
	public List<Leave> getLeave() {

		return (List<Leave>) leaveRepository.findAll();
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
		Optional<Employee> emp = employeeRepository.findById(empId);
		if (emp.isPresent()) {
			emp.get().setRole(role);
			employeeRepository.save(emp.get());
		}

	}

	@Override
	public String employeeReport() {

		return employee.getEmpNotes();
	}

}
