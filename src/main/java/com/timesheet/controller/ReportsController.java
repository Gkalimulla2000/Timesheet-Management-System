package com.timesheet.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Employee;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.TimeSheetService;



@RestController
public class ReportsController {
@Autowired
private EmployeeService employeeService;
@Autowired
private TimeSheetService timesheetService;



@RequestMapping(value = "/employeedetailsReport", method = RequestMethod.GET)
public List<Employee> employeeReport()
{
List<Employee> emp = employeeService.getAllEmps();

return emp;
}



@GetMapping("/timesheetReportForGivenPeriod")
public List<Employee> getTimesheetReportForGivenPeriod( @RequestParam("tsDate") Date tsDate,
@RequestParam("tsNoOfHrs") String tsNoOfHrs) {

List<Employee> employeeList = timesheetService.getTimesheetReportForGivenPeriod(tsDate,tsNoOfHrs);
return employeeList;


}



@GetMapping("/timesheetReportForGivenDate")
public List<Employee> getTimesheetReportForGivenDate(@RequestParam("tsDate") Date tsDate) {

List<Employee> employeeList = timesheetService.getTimesheetReportForGivenDate(tsDate);
return employeeList;


}









}