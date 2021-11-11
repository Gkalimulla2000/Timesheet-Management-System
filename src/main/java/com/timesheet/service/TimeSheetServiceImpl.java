package com.timesheet.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.TimeSheetRepository;
import com.timesheet.entity.TimeSheet;



@Service
public class TimeSheetServiceImpl implements TimeSheetService {
@Autowired
private TimeSheetRepository TimeSheetRepository;
TimeSheet timesheet = new TimeSheet();
@Override
public void insertDate(TimeSheet date) {
TimeSheetRepository.save(date);
}
@Override
public void insertProjectWorking(TimeSheet prjId) {
TimeSheetRepository.save(prjId);
}
@Override
public void insertNumberOfHoursWorked(TimeSheet tsNoOfHrs) {
TimeSheetRepository.save(tsNoOfHrs);
}
@Override
public void insertTypeOfWorkDone(TimeSheet tswk) {
TimeSheetRepository.save(tswk);
}
@Override
public ArrayList<TimeSheet> getAllListOfTimesheet(){
return (ArrayList<TimeSheet>) TimeSheetRepository.findAll();
}
@Override
public void updateTimeSheet(TimeSheet TimeSheet) {
TimeSheetRepository.save(TimeSheet);
}
}