package com.timesheet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TimeSheet")
public class TimeSheet {
@Id
@Column(name="TS_ID",length=10)
Long tsId;

Project prjId;

Employee empId;
@Column(name="TS_ACTIVITY",length=20)
String tsActivity;
@Column(name="TS_DATE")
Date tsDate;
@Column(name="TS_NO_OF_HRS",length=10)
String tsNoOfHrs;
@Column(name="TS_APPROVED",length=20)
String tsApproved;
@Column(name="TS_APPROVED_BY",length=20)
String tsApprovedBy;
@Column(name="TS_REJECTED_REASONS",length=30)
String tsRejectedReasons;
@Column(name="TS_NOTES",length=30)
String tsNotes;
@Column(name="TS_SUGGESTIONS",length=30)
String tsSuggestions;
@Column(name="TS_OTHER_ACTIVITY",length=30)
String tsOtherActivity;
@Column(name="TS_FEEDBACK",length=20)
String tsFeedback;
public TimeSheet(Long tsId, Project prjId, Employee empId, String tsActivity, Date tsDate, String tsNoOfHrs,
		String tsApproved, String tsApprovedBy, String tsRejectedReasons, String tsNotes, String tsSuggestions,
		String tsOtherActivity, String tsFeedback) {
	super();
	this.tsId = tsId;
	this.prjId = prjId;
	this.empId = empId;
	this.tsActivity = tsActivity;
	this.tsDate = tsDate;
	this.tsNoOfHrs = tsNoOfHrs;
	this.tsApproved = tsApproved;
	this.tsApprovedBy = tsApprovedBy;
	this.tsRejectedReasons = tsRejectedReasons;
	this.tsNotes = tsNotes;
	this.tsSuggestions = tsSuggestions;
	this.tsOtherActivity = tsOtherActivity;
	this.tsFeedback = tsFeedback;
}


}
