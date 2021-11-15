package com.timesheet.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.timesheet.entity.Employee;
import com.timesheet.entity.Project;
import com.timesheet.entity.TimeSheet;



public interface TimeSheetService {
public void DailyTimesheet(Employee empId, List<Project> prjId, Date Date, String tsNoOfHrs, String typeOfWork,String discription);
public ArrayList<TimeSheet> getAllListOfTimesheet(Long empId);
public void updateTimeSheet(TimeSheet TimeSheet);
public void approveWeekSheet(Date Date, Employee empId, List<Project> prjId);

}