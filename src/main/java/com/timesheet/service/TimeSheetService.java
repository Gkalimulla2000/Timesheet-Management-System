package com.timesheet.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.timesheet.entity.Employee;
import com.timesheet.entity.Project;
import com.timesheet.entity.TimeSheet;



public interface TimeSheetService {
//public void dailyTimesheet(Long prjId,Date Date, String tsNoOfHrs,	String typeOfWork, String discription);
public void dailyTimesheet(TimeSheet timesheet);
public ArrayList<TimeSheet> getAllListOfTimesheet(Long empId);
public void updateTimeSheet(TimeSheet TimeSheet);
public String approveWeekSheet(Long empId,String tsApproved,String tsApprovedBy,String tsRejectedReasons);
public List<TimeSheet> getTimesheetReportForGivenPeriod(Date tsDate, String tsNoOfHrs);
public List<TimeSheet> getTimesheetReportForGivenDate(Date tsDate);

}