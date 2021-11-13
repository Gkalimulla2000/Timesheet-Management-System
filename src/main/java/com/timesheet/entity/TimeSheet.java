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
/**
 * @return the tsId
 */
public Long getTsId() {
	return tsId;
}
/**
 * @param tsId the tsId to set
 */
public void setTsId(Long tsId) {
	this.tsId = tsId;
}
/**
 * @return the prjId
 */
public Project getPrjId() {
	return prjId;
}
/**
 * @param prjId the prjId to set
 */
public void setPrjId(Project prjId) {
	this.prjId = prjId;
}
/**
 * @return the empId
 */
public Employee getEmpId() {
	return empId;
}
/**
 * @param empId the empId to set
 */
public void setEmpId(Employee empId) {
	this.empId = empId;
}
/**
 * @return the tsActivity
 */
public String getTsActivity() {
	return tsActivity;
}
/**
 * @param tsActivity the tsActivity to set
 */
public void setTsActivity(String tsActivity) {
	this.tsActivity = tsActivity;
}
/**
 * @return the tsDate
 */
public Date getTsDate() {
	return tsDate;
}
/**
 * @param tsDate the tsDate to set
 */
public void setTsDate(Date tsDate) {
	this.tsDate = tsDate;
}
/**
 * @return the tsNoOfHrs
 */
public String getTsNoOfHrs() {
	return tsNoOfHrs;
}
/**
 * @param tsNoOfHrs the tsNoOfHrs to set
 */
public void setTsNoOfHrs(String tsNoOfHrs) {
	this.tsNoOfHrs = tsNoOfHrs;
}
/**
 * @return the tsApproved
 */
public String getTsApproved() {
	return tsApproved;
}
/**
 * @param tsApproved the tsApproved to set
 */
public void setTsApproved(String tsApproved) {
	this.tsApproved = tsApproved;
}
/**
 * @return the tsApprovedBy
 */
public String getTsApprovedBy() {
	return tsApprovedBy;
}
/**
 * @param tsApprovedBy the tsApprovedBy to set
 */
public void setTsApprovedBy(String tsApprovedBy) {
	this.tsApprovedBy = tsApprovedBy;
}
/**
 * @return the tsRejectedReasons
 */
public String getTsRejectedReasons() {
	return tsRejectedReasons;
}
/**
 * @param tsRejectedReasons the tsRejectedReasons to set
 */
public void setTsRejectedReasons(String tsRejectedReasons) {
	this.tsRejectedReasons = tsRejectedReasons;
}
/**
 * @return the tsNotes
 */
public String getTsNotes() {
	return tsNotes;
}
/**
 * @param tsNotes the tsNotes to set
 */
public void setTsNotes(String tsNotes) {
	this.tsNotes = tsNotes;
}
/**
 * @return the tsSuggestions
 */
public String getTsSuggestions() {
	return tsSuggestions;
}
/**
 * @param tsSuggestions the tsSuggestions to set
 */
public void setTsSuggestions(String tsSuggestions) {
	this.tsSuggestions = tsSuggestions;
}
/**
 * @return the tsOtherActivity
 */
public String getTsOtherActivity() {
	return tsOtherActivity;
}
/**
 * @param tsOtherActivity the tsOtherActivity to set
 */
public void setTsOtherActivity(String tsOtherActivity) {
	this.tsOtherActivity = tsOtherActivity;
}
/**
 * @return the tsFeedback
 */
public String getTsFeedback() {
	return tsFeedback;
}
/**
 * @param tsFeedback the tsFeedback to set
 */
public void setTsFeedback(String tsFeedback) {
	this.tsFeedback = tsFeedback;
}


}
