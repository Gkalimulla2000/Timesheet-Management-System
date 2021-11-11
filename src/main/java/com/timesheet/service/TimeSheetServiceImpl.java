package com.timesheet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.TimeSheetRepository;
import com.timesheet.entity.Employee;
import com.timesheet.entity.TimeSheet;



@Service
public class TimeSheetServiceImpl implements TimeSheetService {
@Autowired
private TimeSheetRepository TimeSheetRepository;
TimeSheet timesheet = new TimeSheet();
@Override
public void DailyTimesheet(Employee empId, String prjName, String Date, List<Integer> tsNoOfHrs, String typeOfWork,String discription)
{
TimeSheetRepository.save(empId,prjName,Date,tsNoOfHrs,typeOfWork,discription);
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
public void approveWeekSheet(String Date, Employee empId, String prjName) {
// TODO Auto-generated method stub
TimeSheetRepository.save(Date, empId,prjName);
}
}