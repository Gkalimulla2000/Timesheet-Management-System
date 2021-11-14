package com.timesheet.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Employee;
import com.timesheet.entity.Project;
import com.timesheet.entity.TimeSheet;
import com.timesheet.service.TimeSheetService;



@RestController
public class TimeSheetController {
@Autowired
private TimeSheetService TimeSheetService;
@GetMapping("/getAllListOfTimesheet")
public ArrayList<TimeSheet> getAllListOfTimesheet(Employee empId){
return TimeSheetService.getAllListOfTimesheet(empId);
}
@PostMapping("/DailyTimesheet")
public void DailyTimesheet(@RequestBody Employee empId, List<Project> prjName, Date Date, String tsNoOfHrs, String typeOfWork,String discription){
TimeSheetService.DailyTimesheet(empId,prjName, Date,tsNoOfHrs,typeOfWork,discription);
}
@PostMapping("/approveWeekSheet")
public void approveWeekSheet(@RequestBody Date Date, Employee empId, List<Project> prjName) {
TimeSheetService.approveWeekSheet(Date,empId,prjName);
}
}
