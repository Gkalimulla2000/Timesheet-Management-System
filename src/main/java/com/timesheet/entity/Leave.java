package com.timesheet.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Leave {
@Id
Long leaveId;
String typeOfLeave;
Date fromDate;
Date toDate;
@OneToOne(cascade=CascadeType.ALL)
Employee empId;


public Leave(Long leaveId, String typeOfLeave, Date fromDate, Date toDate, Employee empId) {
	super();
	this.leaveId = leaveId;
	this.typeOfLeave = typeOfLeave;
	this.fromDate = fromDate;
	this.toDate = toDate;
	this.empId = empId;
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
 * @return the leaveId
 */
public Long getLeaveId() {
	return leaveId;
}
/**
 * @param leaveId the leaveId to set
 */
public void setLeaveId(Long leaveId) {
	this.leaveId = leaveId;
}
/**
 * @return the typeOfLeave
 */
public String getTypeOfLeave() {
	return typeOfLeave;
}
/**
 * @param typeOfLeave the typeOfLeave to set
 */
public void setTypeOfLeave(String typeOfLeave) {
	this.typeOfLeave = typeOfLeave;
}
public Date getFromDate() {
	return fromDate;
}
public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}
public Date getToDate() {
	return toDate;
}
public void setToDate(Date toDate) {
	this.toDate = toDate;
}
public Leave() {
	
}

}
