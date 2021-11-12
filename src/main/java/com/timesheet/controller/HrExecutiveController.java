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

import com.timesheet.entity.Employee;
import com.timesheet.service.EmployeeService;



public class HrExecutiveController {

@Autowired
private EmployeeService EmployeeService;


@RequestMapping(value = "/getleave", method = RequestMethod.GET)
public List<Employee> getLeave() {

return EmployeeService.getLeave();



}

@RequestMapping(value = "/getMonthLeaveReport", method = RequestMethod.GET)
public List<Employee> getMonthLeaveReport() {



return EmployeeService.getMonthLeaveReport();



}



@GetMapping("/getAllEmpsDetails")
public ArrayList<Employee> getAllEmp(){
return EmployeeService.getAllEmps();
}


@DeleteMapping("/employees")
public void deleteAllEmployees(){
EmployeeService.deleteAllEmployees();
}




@DeleteMapping("employees/{id}")
public void deleteEmployeeByID(@RequestBody Employee e, @PathVariable int id){
EmployeeService.deleteEmployeeByID(id);
}


@GetMapping(value="/emp/changePassword/{empId}")
@ResponseBody
public String changePassword(@RequestParam String empPassword,@PathVariable Long empId) {
EmployeeService.changePassword(empPassword,empId);
return empPassword;
}





}
