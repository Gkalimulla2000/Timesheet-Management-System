package com.timesheet.service;

import java.util.Date;
import java.util.List;

import com.timesheet.entity.Leave;

public interface LeaveService {

	void applyLeave(Leave leave);
	List<Leave> getAllLeave();
	List<Leave> getMonthLeaveReport(Date fromDate,Date toDate);
}