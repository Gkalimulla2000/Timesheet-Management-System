package com.timesheet.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
enum STATUS{
	Deleted,
	Not;
}
@Entity
@Table(name="Project")
public class Project {
@Id
@Column(name="PRJ_ID",length=10)
Long prjId;
@Column(name="PRJ_NAME",length=20)
String prjName;
@Column(name="PRJ_CLIENT_NAME",length=10)
String prjClientName;
@Column(name="PRJ_CLIENT_BRIEF",length=10)
String prjClientBrief;
@Column(name="PRJ_CLIENT_MANAGER",length=20)
String prjClientManager;
@Column(name="PRJ_CLIENT_EMIALID",length=20)
String prjClientEmailId;
@Column(name="PRJ_OS_ID",length=50)
String prjOsId;
@Column(name="PRJ_DB_ID",length=20)
String prjDbIj;
@Column(name="PRJ_APP_SERVER_ID",length=20)
String prjAppServerId;
@Column(name="PRJ_PM_NAME",length=20)
String prjPmName;
@Column(name="PRJ_PL",length=20)
String prjPl;
@Column(name="PRJ_NOTES",length=50)
String prjNotes;
@Column(name="PRJ_START_DATE")
Date prjStartDate;
@Column(name="PRJ_END_DATE")
Date prjEndDate;
@Column(name="PRJ_STATUS",length=20)
STATUS status;
public Project(Long prjId, String prjName, String prjClientName, String prjClientBrief, String prjClientManager,
		String prjClientEmailId, String prjOsId, String prjDbIj, String prjAppServerId, String prjPmName, String prjPl,
		String prjNotes, Date prjStartDate, Date prjEndDate, STATUS status) {
	super();
	this.prjId = prjId;
	this.prjName = prjName;
	this.prjClientName = prjClientName;
	this.prjClientBrief = prjClientBrief;
	this.prjClientManager = prjClientManager;
	this.prjClientEmailId = prjClientEmailId;
	this.prjOsId = prjOsId;
	this.prjDbIj = prjDbIj;
	this.prjAppServerId = prjAppServerId;
	this.prjPmName = prjPmName;
	this.prjPl = prjPl;
	this.prjNotes = prjNotes;
	this.prjStartDate = prjStartDate;
	this.prjEndDate = prjEndDate;
	this.status = status;
}
public Project() {
	// TODO Auto-generated constructor stub
}
public Long getPrjId() {
	return prjId;
}
public void setPrjId(Long prjId) {
	this.prjId = prjId;
}
public String getPrjName() {
	return prjName;
}
public void setPrjName(String prjName) {
	this.prjName = prjName;
}
public String getPrjClientName() {
	return prjClientName;
}
public void setPrjClientName(String prjClientName) {
	this.prjClientName = prjClientName;
}
public String getPrjClientBrief() {
	return prjClientBrief;
}
public void setPrjClientBrief(String prjClientBrief) {
	this.prjClientBrief = prjClientBrief;
}
public String getPrjClientManager() {
	return prjClientManager;
}
public void setPrjClientManager(String prjClientManager) {
	this.prjClientManager = prjClientManager;
}
public String getPrjClientEmailId() {
	return prjClientEmailId;
}
public void setPrjClientEmailId(String prjClientEmailId) {
	this.prjClientEmailId = prjClientEmailId;
}
public String getPrjOsId() {
	return prjOsId;
}
public void setPrjOsId(String prjOsId) {
	this.prjOsId = prjOsId;
}
public String getPrjDbIj() {
	return prjDbIj;
}
public void setPrjDbIj(String prjDbIj) {
	this.prjDbIj = prjDbIj;
}
public String getPrjAppServerId() {
	return prjAppServerId;
}
public void setPrjAppServerId(String prjAppServerId) {
	this.prjAppServerId = prjAppServerId;
}
public String getPrjPmName() {
	return prjPmName;
}
public void setPrjPmName(String prjPmName) {
	this.prjPmName = prjPmName;
}
public String getPrjPl() {
	return prjPl;
}
public void setPrjPl(String prjPl) {
	this.prjPl = prjPl;
}
public String getPrjNotes() {
	return prjNotes;
}
public void setPrjNotes(String prjNotes) {
	this.prjNotes = prjNotes;
}
public Date getPrjStartDate() {
	return prjStartDate;
}
public void setPrjStartDate(Date prjStartDate) {
	this.prjStartDate = prjStartDate;
}
public Date getPrjEndDate() {
	return prjEndDate;
}
public void setPrjEndDate(Date prjEndDate) {
	this.prjEndDate = prjEndDate;
}
public STATUS getStatus() {
	return status;
}
public void setStatus(STATUS status) {
	this.status = status;
}
@Override
public String toString() {
	return "Project [prjId=" + prjId + ", prjName=" + prjName + ", prjClientName=" + prjClientName + ", prjClientBrief="
			+ prjClientBrief + ", prjClientManager=" + prjClientManager + ", prjClientEmailId=" + prjClientEmailId
			+ ", prjOsId=" + prjOsId + ", prjDbIj=" + prjDbIj + ", prjAppServerId=" + prjAppServerId + ", prjPmName="
			+ prjPmName + ", prjPl=" + prjPl + ", prjNotes=" + prjNotes + ", prjStartDate=" + prjStartDate
			+ ", prjEndDate=" + prjEndDate + ", status=" + status + "]";
}

}
