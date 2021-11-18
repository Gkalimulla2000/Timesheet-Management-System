package com.timesheet.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Employee;
import com.timesheet.entity.Leave;
import com.timesheet.exception.RecordAlreadyPresentException;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.LeaveService;

@RestController
public class HrExecutiveController {
	public static final String NO_RECORD_FOUND = "No Record Found";
	public static final String RECORD_ALREADY_EXIST = "record already exists";
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private LeaveService leaveService;

	@GetMapping("/getleave")
	public List<Leave> getLeave() {

		return leaveService.getAllLeave();

	}

	@GetMapping("/getMonthLeaveReport")
	public List<Leave> getMonthLeaveReport(@RequestParam Date fromDate, Date toDate) {
		return leaveService.getMonthLeaveReport(fromDate, toDate);
	}

	@GetMapping("/HR/getAllEmpsDetails")
	public List<Employee> getAllEmp() {
		return employeeService.getAllEmps();
	}

	@DeleteMapping("/HR/employees")
	public void deleteAllEmployees() {
		employeeService.deleteAllEmployees();
	}

	@DeleteMapping("/HR/employees/{id}")
	public void deleteEmployeeByID(@PathVariable Long id) {

		employeeService.deleteEmployeeByID(id);
	}

	@GetMapping(value = "/HR/emp/changePassword/{empId}")
	@ResponseBody
	public String changePassword(@RequestParam String empPassword, @PathVariable Long empId) {
		Employee employee =employeeService.getEmpById(empId);
		String existingPassword = employee.getEmpPassword();
		if (existingPassword.equals(empPassword)) {
			throw new RecordAlreadyPresentException(RECORD_ALREADY_EXIST);
		}
		employeeService.changePassword(empPassword, empId);
		return empPassword;
	}

}
