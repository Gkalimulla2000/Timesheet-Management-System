package com.timesheet.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.EmployeeRepository;
import com.timesheet.dao.ProjectRepository;
import com.timesheet.dao.TimeSheetRepository;
import com.timesheet.entity.Employee;
import com.timesheet.entity.TimeSheet;
import com.timesheet.exception.NoEmployeeFoundException;

@Service
public class TimeSheetServiceImpl implements TimeSheetService {
	@Autowired
	private TimeSheetRepository timeSheetRepository;
	@Autowired
	private ProjectRepository projectRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	TimeSheet timesheet ;

//@Override
//public void dailyTimesheet(Long prjId,Date Date, String tsNoOfHrs,	String typeOfWork, String discription)
//{
//	Optional<TimeSheet> time=timeSheetRepository.findById(prjId);
//	Optional<Project> project=projectRepository.findById(prjId);
//		timesheet.setPrjId(project.get());
//		timesheet.setTsDate(Date);
//		timesheet.setTsNoOfHrs(tsNoOfHrs);
//		timesheet.setTsActivity(typeOfWork);
//		timesheet.setTsNotes(discription);
//		timeSheetRepository.save(timesheet);
//}

	@Override
	public void dailyTimesheet(TimeSheet timesheet) {
		timeSheetRepository.save(timesheet);

	}

	@Override
	public List<TimeSheet> getAllListOfTimesheet(Long empId) {

		return (List<TimeSheet>) timeSheetRepository.findAll();
	}

	@Override
	public void updateTimeSheet(TimeSheet timeSheet) {

		timeSheetRepository.save(timeSheet);

	}

	@Override
	public String approveWeekSheet(Long empId,String tsApproved, String tsApprovedBy, String tsRejectedReasons) {
Optional<Employee> employee=employeeRepository.findById(empId);
if(employee.isPresent()) {
		timesheet.setTsApproved(tsApproved);
		timesheet.setTsApprovedBy(tsApprovedBy);
		timesheet.setTsRejectedReasons(tsRejectedReasons);
		timeSheetRepository.save(timesheet);
}else {
	throw new NoEmployeeFoundException("No employee with this id");
}
return "approved Succesfully";
	} 

	@Override
	public List<TimeSheet> getTimesheetReportForGivenPeriod(Date tsDate, String tsNoOfHrs) {
		
//	if(timesheet.getTsDate().equals(tsDate) && timesheet.getTsNoOfHrs().equals(tsNoOfHrs))
//			 timeSheetRepository.findAll();
//		else
//			throw new NoEmployeeFoundException("No timeSheet Found");
		return  (List<TimeSheet>) timeSheetRepository.findAll();
		 
	}

	@Override
	public List<TimeSheet> getTimesheetReportForGivenDate(Date tsDate) {
		
		return (List<TimeSheet>) timeSheetRepository.findAll();
	}
}