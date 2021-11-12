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
@Column(name="TS_ID")
Long tsId;

Project prjId;

Employee empId;
@Column(name="TS_ACTIVITY")
String tsActivity;
@Column(name="TS_DATE")
Date tsDate;
@Column(name="TS_NO_OF_HRS")
String tsNoOfHrs;
@Column(name="TS_APPROVED")
String tsApproved;
@Column(name="TS_APPROVED_BY")
String tsApprovedBy;
@Column(name="TS_REJECTED_REASONS")
String tsRejectedReasons;
@Column(name="TS_NOTES")
String tsNotes;
@Column(name="TS_FEEDBACK")
String tsFeedback;
public TimeSheet(Long tsId, Project prjId, Employee empId, String tsActivity, Date tsDate, String tsNoOfHrs,
		String tsApproved, String tsApprovedBy, String tsRejectedReasons, String tsNotes, String tsFeedback) {
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
	this.tsFeedback = tsFeedback;
}
public TimeSheet() {
	// TODO Auto-generated constructor stub
}
public Long getTsId() {
	return tsId;
}
public void setTsId(Long tsId) {
	this.tsId = tsId;
}
public Project getPrjId() {
	return prjId;
}
public void setPrjId(Project prjId) {
	this.prjId = prjId;
}
public Employee getEmpId() {
	return empId;
}
public void setEmpId(Employee empId) {
	this.empId = empId;
}
public String getTsActivity() {
	return tsActivity;
}
public void setTsActivity(String tsActivity) {
	this.tsActivity = tsActivity;
}
public Date getTsDate() {
	return tsDate;
}
public void setTsDate(Date tsDate) {
	this.tsDate = tsDate;
}
public String getTsNoOfHrs() {
	return tsNoOfHrs;
}
public void setTsNoOfHrs(String tsNoOfHrs) {
	this.tsNoOfHrs = tsNoOfHrs;
}
public String getTsApproved() {
	return tsApproved;
}
public void setTsApproved(String tsApproved) {
	this.tsApproved = tsApproved;
}
public String getTsApprovedBy() {
	return tsApprovedBy;
}
public void setTsApprovedBy(String tsApprovedBy) {
	this.tsApprovedBy = tsApprovedBy;
}
public String getTsRejectedReasons() {
	return tsRejectedReasons;
}
public void setTsRejectedReasons(String tsRejectedReasons) {
	this.tsRejectedReasons = tsRejectedReasons;
}
public String getTsNotes() {
	return tsNotes;
}
public void setTsNotes(String tsNotes) {
	this.tsNotes = tsNotes;
}
public String getTsFeedback() {
	return tsFeedback;
}
public void setTsFeedback(String tsFeedback) {
	this.tsFeedback = tsFeedback;
}
@Override
public String toString() {
	return "TimeSheet [tsId=" + tsId + ", prjId=" + prjId + ", empId=" + empId + ", tsActivity=" + tsActivity
			+ ", tsDate=" + tsDate + ", tsNoOfHrs=" + tsNoOfHrs + ", tsApproved=" + tsApproved + ", tsApprovedBy="
			+ tsApprovedBy + ", tsRejectedReasons=" + tsRejectedReasons + ", tsNotes=" + tsNotes + ", tsFeedback="
			+ tsFeedback + "]";
}
}
