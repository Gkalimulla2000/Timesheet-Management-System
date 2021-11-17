package com.timesheet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "TimeSheet")
public class TimeSheet implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "TS_ID", length = 10)
	Long tsId;
	@OneToOne
	@PrimaryKeyJoinColumn
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Project prjId;
	@ManyToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "EMP_TIMESHEET")
	Employee empId;
	@Column(name = "TS_ACTIVITY", length = 20)
	String tsActivity;
	@Column(name = "TS_DATE")
	Date tsDate;
	@Column(name = "TS_NO_OF_HRS", length = 10)
	String tsNoOfHrs;
	@Column(name = "TS_APPROVED", length = 20)
	String tsApproved;
	@Column(name = "TS_APPROVED_BY", length = 20)
	String tsApprovedBy;
	@Column(name = "TS_REJECTED_REASONS", length = 30)
	String tsRejectedReasons;
	@Column(name = "TS_NOTES", length = 30)
	String tsNotes;
	@Column(name = "TS_SUGGESTIONS", length = 30)
	String tsSuggestions;
	@Column(name = "TS_OTHER_ACTIVITY", length = 30)
	String tsOtherActivity;
	@Column(name = "TS_FEEDBACK", length = 20)
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

	public TimeSheet() {

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

	public String getTsSuggestions() {
		return tsSuggestions;
	}

	public void setTsSuggestions(String tsSuggestions) {
		this.tsSuggestions = tsSuggestions;
	}

	public String getTsOtherActivity() {
		return tsOtherActivity;
	}

	public void setTsOtherActivity(String tsOtherActivity) {
		this.tsOtherActivity = tsOtherActivity;
	}

	public String getTsFeedback() {
		return tsFeedback;
	}

	public void setTsFeedback(String tsFeedback) {
		this.tsFeedback = tsFeedback;
	}

}
