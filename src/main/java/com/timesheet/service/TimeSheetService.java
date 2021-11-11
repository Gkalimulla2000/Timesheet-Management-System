package com.timesheet.service;
import java.util.ArrayList;
import java.util.List;



import com.timesheet.entity.Employee;
import com.timesheet.entity.TimeSheet;



public interface TimeSheetService {
public void DailyTimesheet(Employee empId, String prjName, String Date, List<Integer> tsNoOfHrs, String typeOfWork,String discription);
public ArrayList<TimeSheet> getAllListOfTimesheet(Employee empId);
public void updateTimeSheet(TimeSheet TimeSheet);
public void approveWeekSheet(String Date, Employee empId, String prjName);

}