package com.timesheet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Employee;
import com.timesheet.entity.Leave;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.LeaveService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService EmployeeService;
	@Autowired
	private LeaveService LeaveService;
	
	
	@GetMapping("/getAllEmps")
	public ArrayList<Employee> getAllEmp() {
		return EmployeeService.getAllEmps();
	}
	@GetMapping("/getEmpById/{empId}")
	public Employee getEmpById(@PathVariable Long empId ) {
		return EmployeeService.getEmpById(empId);
		
	}

	@PostMapping("/addEmp")
	public void addEmp(@RequestBody Employee emp) {
		EmployeeService.insertEmp(emp);
	}

	@PutMapping(value = "/emp/updateEmp")
	public void changePassword(@RequestBody Employee emp) {

		EmployeeService.updateEmp(emp);
	}

	@PostMapping(value = "/emp/changePassword/{empId}")
	@ResponseBody
	public void changePassword(@RequestParam String empPassword, @PathVariable Long empId) {
		EmployeeService.changePassword(empPassword, empId);

	}
	@PostMapping(value="/emp/applyForLeave")
	@ResponseBody
	public void applyLeave(@RequestBody Leave leave) {
		LeaveService.applyLeave(leave);
	}
	@GetMapping(value="/emp/getAllEmpLeave")
	public List<Leave> getEmpLeave(@RequestParam Long empId){
		return LeaveService.getEmpLeave(empId);
	}
	
}
