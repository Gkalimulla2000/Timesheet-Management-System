package com.timesheet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Employee;
import com.timesheet.entity.Leave;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.LeaveService;
@RestController
public class HrExecutiveController {

	@Autowired
	private EmployeeService EmployeeService;
	@Autowired
	private LeaveService LeaveService;

	@RequestMapping(value = "/getleave", method = RequestMethod.GET)
	public List<Leave> getLeave() {

		return LeaveService.getAllLeave();

	}

	@RequestMapping(value = "/getMonthLeaveReport", method = RequestMethod.GET)
	public List<Employee> getMonthLeaveReport() {
		return EmployeeService.getMonthLeaveReport();
	}

	@GetMapping("/HR/getAllEmpsDetails")
	public ArrayList<Employee> getAllEmp() {
		return EmployeeService.getAllEmps();
	}

	@DeleteMapping("/HR/employees")
	public void deleteAllEmployees() {
		EmployeeService.deleteAllEmployees();
	}

	@DeleteMapping("/HR/employees/{id}")
	public void deleteEmployeeByID(@RequestBody Employee e, @PathVariable Long id) {
		EmployeeService.deleteEmployeeByID(id);
	}

	@GetMapping(value = "/HR/emp/changePassword/{empId}")
	@ResponseBody
	public String changePassword(@RequestParam String empPassword, @PathVariable Long empId) {
		EmployeeService.changePassword(empPassword, empId);
		return empPassword;
	}

}
