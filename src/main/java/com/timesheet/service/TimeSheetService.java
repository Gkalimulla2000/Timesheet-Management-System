package com.timesheet.service;
import java.util.Date;
import java.util.List;

import com.timesheet.entity.TimeSheet;



public interface TimeSheetService {
//public void dailyTimesheet(Long prjId,Date Date, String tsNoOfHrs,	String typeOfWork, String discription);
public void dailyTimesheet(TimeSheet timesheet);
public List<TimeSheet> getAllListOfTimesheet(Long empId);
public void updateTimeSheet(TimeSheet timeSheet);
public String approveWeekSheet(Long empId,String tsApproved,String tsApprovedBy,String tsRejectedReasons);
public List<TimeSheet> getTimesheetReportForGivenPeriod(Date tsDate, String tsNoOfHrs);
public List<TimeSheet> getTimesheetReportForGivenDate(Date tsDate);

}