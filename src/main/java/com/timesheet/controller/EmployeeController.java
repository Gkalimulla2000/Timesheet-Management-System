package com.timesheet.controller;

import java.util.ArrayList;

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
import com.timesheet.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
private EmployeeService EmployeeService;

@GetMapping("/getAllEmps")
public ArrayList<Employee> getAllEmp(){
	return EmployeeService.getAllEmps();
}
	
@PostMapping("/addEmp")
public void addEmp(@RequestBody Employee emp) {
	EmployeeService.insertEmp(emp);
}
@PutMapping(value="/emp/updateEmp")
public void changePassword(@RequestBody Employee emp) {
	
	EmployeeService.updateEmp(emp);
}
@GetMapping(value="/emp/changePassword/{empId}")
@ResponseBody
public String changePassword(@RequestParam String empPassword,@PathVariable Long empId) {
	EmployeeService.changePassword(empPassword,empId);
	return empPassword;
}


	
}
