package com.timesheet.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.EmployeeRepository;
import com.timesheet.dao.LeaveRepository;
import com.timesheet.entity.Leave;
@Service
public class LeaveServiceImpl implements LeaveService{
	@Autowired
	private LeaveRepository leaveRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void applyLeave(Leave leave) {
		
		leaveRepository.save(leave);
	}
	public List<Leave> getAllLeave() {
		return (List<Leave>) leaveRepository.findAll();
	}
	@Override
	public List<Leave> getMonthLeaveReport(Date fromDate,Date toDate) {
	Leave leaves=new Leave();
	Date fDate=leaves.getFromDate();
	Date tDate =leaves.getToDate();
		if(fDate.after(fromDate) && tDate.before(toDate)) 
			
			leaveRepository.save(leaves);
		return (List<Leave>) leaveRepository.findAll();
		
		
	}
}

