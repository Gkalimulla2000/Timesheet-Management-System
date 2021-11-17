package com.timesheet.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import com.timesheet.exception.NoEmployeeFoundException;
import com.timesheet.exception.RecordAlreadyPresentException;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.LeaveService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
@Autowired
	private LeaveService leaveService; 
	
	
	@GetMapping("/getAllEmps")
	public ArrayList<Employee> getAllEmp() {
		List<Employee> emp=employeeService.getAllEmps();
		if(emp.size()==0) {
			throw new NoEmployeeFoundException("No employees Present");
		}
		return employeeService.getAllEmps();
	}
	@GetMapping("/getEmpById/{empId}")
	public Employee getEmpById(@PathVariable Long empId ) {
		Optional<Employee> emp=Optional.of(employeeService.getEmpById(empId));
		if(!emp.isPresent()) {
			throw new NoEmployeeFoundException(empId+" is not present");
		}
		
		return employeeService.getEmpById(empId);
		
	}

	@PostMapping("/addEmp")
	public void addEmp(@RequestBody Employee emp) {
		
		employeeService.insertEmp(emp);
	}

	@PutMapping(value = "/emp/updateEmp")
	public void changePassword(@RequestBody Employee emp) {
		
		employeeService.updateEmp(emp);
	}

	@PostMapping(value = "/emp/changePassword/{empId}")
	@ResponseBody
	public void changePassword(@RequestParam String empPassword, @PathVariable Long empId) {
		Employee employee=new Employee();
		String existingPassword=employee.getEmpPassword();
		if(existingPassword.equals(empPassword)) {
			throw new RecordAlreadyPresentException(empPassword+" is same as previous");
		}
		employeeService.changePassword(empPassword, empId);

	}
	@PostMapping(value="/emp/applyForLeave")
	@ResponseBody
	public void applyLeave(@RequestBody Leave leave) {
		leaveService.applyLeave(leave);
	}
/*	@GetMapping(value="/emp/getAllEmpLeave")
	public List<Leave> getEmpLeave(@RequestParam Long empId){
		return leaveService.getEmpLeave(empId);
	}*/
	
}
