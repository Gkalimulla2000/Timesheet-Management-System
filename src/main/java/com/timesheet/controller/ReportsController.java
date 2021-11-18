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
import com.timesheet.entity.TimeSheet;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.TimeSheetService;



@RestController
public class ReportsController {
@Autowired
private EmployeeService employeeService;
@Autowired
private TimeSheetService timesheetService;




@RequestMapping(value = "/employeedetailsReport", method = RequestMethod.GET)
public String employeeReport()
{
	
String employee = employeeService.employeeReport();

return employee;
}



@GetMapping("/timesheetReportForGivenPeriod")
public List<TimeSheet> getTimesheetReportForGivenPeriod( @RequestParam("tsDate") Date tsDate,
@RequestParam("tsNoOfHrs") String tsNoOfHrs) {

List<TimeSheet> timeSheetList = timesheetService.getTimesheetReportForGivenPeriod(tsDate,tsNoOfHrs);
return timeSheetList;


}



@GetMapping("/timesheetReportForGivenDate")
public List<TimeSheet> getTimesheetReportForGivenDate(@RequestParam("tsDate") Date tsDate) {

	List<TimeSheet> timeSheetList = timesheetService.getTimesheetReportForGivenDate(tsDate);
return timeSheetList;


}









}