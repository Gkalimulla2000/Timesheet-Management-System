package com.timesheet.entity;

public class Leave {
Long leaveId;
String typeOfLeave;
public Leave(Long leaveId, String typeOfLeave) {
	super();
	this.leaveId = leaveId;
	this.typeOfLeave = typeOfLeave;
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
public Leave() {
	// TODO Auto-generated constructor stub
}

}
