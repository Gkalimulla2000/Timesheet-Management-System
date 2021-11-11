package com.timesheet.service;

import java.util.ArrayList;



import com.timesheet.entity.TimeSheet;



public interface TimeSheetService {
public void insertDate(TimeSheet date);
public void insertProjectWorking(TimeSheet prjId);
public void insertNumberOfHoursWorked(TimeSheet tsNoOfHrs);
public void insertTypeOfWorkDone(TimeSheet tsWk);
public ArrayList<TimeSheet> getAllListOfTimesheet();
public void updateTimeSheet(TimeSheet TimeSheet);

}