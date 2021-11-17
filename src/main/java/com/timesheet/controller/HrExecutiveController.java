package com.timesheet.controller;

import java.util.ArrayList;
import java.util.Date;
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
import com.timesheet.exception.RecordAlreadyPresentException;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.LeaveService;
@RestController
public class HrExecutiveController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private LeaveService leaveService;

	@RequestMapping(value = "/getleave", method = RequestMethod.GET)
	public List<Leave> getLeave() {

		return leaveService.getAllLeave();

	}

	@RequestMapping(value = "/getMonthLeaveReport", method = RequestMethod.GET)
	public List<Leave> getMonthLeaveReport(@RequestParam Date fromDate,Date toDate) {
		return leaveService.getMonthLeaveReport(fromDate,toDate);
	}
	

	@GetMapping("/HR/getAllEmpsDetails")
	public ArrayList<Employee> getAllEmp() {
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
		Employee employee=new Employee();
		String existingPassword=employee.getEmpPassword();
		if(existingPassword.equals(empPassword)) {
			throw new RecordAlreadyPresentException(empPassword+" is same as previous");
		}
		employeeService.changePassword(empPassword, empId);
		return empPassword;
	}

}
