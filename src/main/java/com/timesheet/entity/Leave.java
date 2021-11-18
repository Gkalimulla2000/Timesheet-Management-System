package com.timesheet.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Leave {
@Id
private Long leaveId;
private String typeOfLeave;
private Date fromDate;
private Date toDate;
@OneToOne(cascade=CascadeType.ALL)
private Employee empId;

public Leave() {
	super();
}
public Employee getEmpId() {
	return empId;
}

public void setEmpId(Employee empId) {
	this.empId = empId;
}

public Long getLeaveId() {
	return leaveId;
}

public void setLeaveId(Long leaveId) {
	this.leaveId = leaveId;
}

public String getTypeOfLeave() {
	return typeOfLeave;
}

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


}
