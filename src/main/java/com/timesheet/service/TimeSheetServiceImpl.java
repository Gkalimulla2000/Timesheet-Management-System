package com.timesheet.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.TimeSheetRepository;
import com.timesheet.entity.Employee;
import com.timesheet.entity.Project;
import com.timesheet.entity.TimeSheet;



@Service
public class TimeSheetServiceImpl implements TimeSheetService {
@Autowired
private TimeSheetRepository TimeSheetRepository;
TimeSheet timesheet = new TimeSheet();
@Override
public void DailyTimesheet(Employee empId, List<Project> prjId, Date Date, String tsNoOfHrs, String typeOfWork,String discription)
{
	timesheet.setEmpId(empId);
	timesheet.setPrjId(prjId);
	timesheet.setTsDate(Date);
	timesheet.setTsNoOfHrs(tsNoOfHrs);
	timesheet.setTsActivity(typeOfWork);
	timesheet.setTsNotes(discription);
	TimeSheetRepository.save(timesheet);
	
	
//TimeSheetRepository.save(empId,prjName,Date,tsNoOfHrs,typeOfWork,discription);
}
@Override
public ArrayList<TimeSheet> getAllListOfTimesheet(Employee empId) {
// TODO Auto-generated method stub
return (ArrayList<TimeSheet>) TimeSheetRepository.findAll();
}
@Override
public void updateTimeSheet(TimeSheet TimeSheet) {
// TODO Auto-generated method stub
TimeSheetRepository.save(TimeSheet);

}
@Override
public void approveWeekSheet(Date Date, Employee empId, List<Project> prjId) {
// TODO Auto-generated method stub
	timesheet.setTsDate(Date);
	timesheet.setPrjId(prjId);
	timesheet.setEmpId(empId);
	
TimeSheetRepository.save(timesheet);
}
}