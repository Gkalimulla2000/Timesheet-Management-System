package com.timesheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.TimeSheet;
import com.timesheet.service.TimeSheetService;

@RestController
public class TimeSheetController {
	@Autowired
	private TimeSheetService timeSheetService;

	@GetMapping("/getAllListOfTimesheet")
	public List<TimeSheet> getAllListOfTimesheet(Long empId) {
		return timeSheetService.getAllListOfTimesheet(empId);
	}
	
	@PostMapping("/DailyTimesheet")
	public void dailyTimesheet(@RequestBody TimeSheet timesheet) {
		timeSheetService.dailyTimesheet(timesheet);
	}

	@PostMapping("/approveWeekSheet")
	public String approveWeekSheet(@RequestParam Long empId ,String tsApproved, String tsApprovedBy, String tsRejectedReasons) {
		return timeSheetService.approveWeekSheet(empId,tsApproved,tsApprovedBy,tsRejectedReasons);
	}
}
