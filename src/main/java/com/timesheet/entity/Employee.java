package com.timesheet.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	
@Id
@Column(name="EMP_ID",length=10)
private Long empId;
@Column(name="EMP_NAME",length=20)
private String empName;
@Column(name="EMP_DESIGNATION_ID",length=10)
private String empDesignationId;
@Column(name="EMP_JOIN_DATE")
private Date empJoinDate;
@Column(name="EMP_SKILLS",length=20)
private String empSkills;
@Column(name="EMP_DEPARTMENT_ID",length=20)
private String empDepartmentId;
@Column(name="EMP_NOTES",length=50)
private String empNotes;
@Column(name="EMP_EMIAL",length=20)
private String empEmail;
@Column(name="EMP_PHONE",length=20)
private String empPhone;
@Column(name="EMP_USENAME",length=20)
private String empUserName;
@Column(name="EMP_PASSWORD",length=20)
private String empPassword;
@OneToOne
private Roles role;


public Employee() {
	super();
}
public Roles getRole() {
	return role;
}

public void setRole(Roles role) {
	this.role = role;
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


