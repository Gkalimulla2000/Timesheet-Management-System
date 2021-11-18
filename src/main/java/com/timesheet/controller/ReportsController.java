package com.timesheet.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.TimeSheet;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.TimeSheetService;

@RestController
public class ReportsController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private TimeSheetService timesheetService;

	@GetMapping("/employeedetailsReport")
	public String employeeReport() {

		return  employeeService.employeeReport();

		
	}

	@GetMapping("/timesheetReportForGivenPeriod")
	public List<TimeSheet> getTimesheetReportForGivenPeriod(@RequestParam("tsDate") Date tsDate,
			@RequestParam("tsNoOfHrs") String tsNoOfHrs) {

		return timesheetService.getTimesheetReportForGivenPeriod(tsDate, tsNoOfHrs);
		 

	}

	@GetMapping("/timesheetReportForGivenDate")
	public List<TimeSheet> getTimesheetReportForGivenDate(@RequestParam("tsDate") Date tsDate) {

		return timesheetService.getTimesheetReportForGivenDate(tsDate);
		 

	}

}