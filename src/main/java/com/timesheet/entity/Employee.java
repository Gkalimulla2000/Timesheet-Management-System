package com.timesheet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
@Id
@Column(name="EMP_ID")
Long empId;
@Column(name="EMP_NAME")
String empName;
@Column(name="EMP_DESIGNATION_ID")
String empDesignationId;
@Column(name="EMP_JOIN_DATE")
Date empJoinDate;
@Column(name="EMP_SKILLS")
String empSkills;
@Column(name="EMP_DEPARTMENT_ID")
String empDepartmentId;
@Column(name="EMP_NOTES")
String empNotes;
@Column(name="EMP_EMIAL")
String empEmail;
@Column(name="EMP_PHONE")
String empPhone;
@Column(name="EMP_USENAME")
String empUserName;
@Column(name="EMP_PASSWORD")
String empPassword;
public Employee(Long empId, String empName, String empDesignationId, Date empJoinDate, String empSkills,
		String empDepartmentId, String empNotes, String empEmail, String empPhone, String empUserName,
		String empPassword) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empDesignationId = empDesignationId;
	this.empJoinDate = empJoinDate;
	this.empSkills = empSkills;
	this.empDepartmentId = empDepartmentId;
	this.empNotes = empNotes;
	this.empEmail = empEmail;
	this.empPhone = empPhone;
	this.empUserName = empUserName;
	this.empPassword = empPassword;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
public Long getEmpId() {
	return empId;
}
public void setEmpId(Long empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDesignationId() {
	return empDesignationId;
}
public void setEmpDesignationId(String empDesignationId) {
	this.empDesignationId = empDesignationId;
}
public Date getEmpJoinDate() {
	return empJoinDate;
}
public void setEmpJoinDate(Date empJoinDate) {
	this.empJoinDate = empJoinDate;
}
public String getEmpSkills() {
	return empSkills;
}
public void setEmpSkills(String empSkills) {
	this.empSkills = empSkills;
}
public String getEmpDepartmentId() {
	return empDepartmentId;
}
public void setEmpDepartmentId(String empDepartmentId) {
	this.empDepartmentId = empDepartmentId;
}
public String getEmpNotes() {
	return empNotes;
}
public void setEmpNotes(String empNotes) {
	this.empNotes = empNotes;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
public String getEmpPhone() {
	return empPhone;
}
public void setEmpPhone(String empPhone) {
	this.empPhone = empPhone;
}
public String getEmpUserName() {
	return empUserName;
}
public void setEmpUserName(String empUserName) {
	this.empUserName = empUserName;
}
public String getEmpPassword() {
	return empPassword;
}
public void setEmpPassword(String empPassword) {
	this.empPassword = empPassword;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignationId=" + empDesignationId
			+ ", empJoinDate=" + empJoinDate + ", empSkills=" + empSkills + ", empDepartmentId=" + empDepartmentId
			+ ", empNotes=" + empNotes + ", empEmail=" + empEmail + ", empPhone=" + empPhone + ", empUserName="
			+ empUserName + ", empPassword=" + empPassword + "]";
}

}


