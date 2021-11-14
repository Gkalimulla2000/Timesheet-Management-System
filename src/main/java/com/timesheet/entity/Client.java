package com.timesheet.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Client")
public class Client {
@Id
@Column(name="CLIENT_ID",nullable=false)
Long clientId;
@Column(name="CLIENT_NAME",nullable=false)
String clientName;
@Column(name="CLIENT_ADDRESS",nullable=false)
String clientAddress;
@Column(name="CLIENT_EMAIL_ID",nullable=false)
String clientEmailId;
@OneToOne
Project prjName;


public Client(Long clientId, String clientName, String clientCompany, String clientEmailId, Project prjName, String clientAddress) {
super();
this.clientId = clientId;
this.clientName = clientName;
this.clientAddress = clientAddress;
this.clientEmailId = clientEmailId;
this.prjName = prjName;
}


public Long getClientId() {
return clientId;
}
public void setClientId(Long clientId) {
this.clientId = clientId;
}
public String getClientName() {
return clientName;
}
public void setClientName(String clientName) {
this.clientName = clientName;
}
public String getClientAddress() {
return clientAddress;
}
public void setClientAddress(String clientCompany) {
this.clientAddress = clientCompany;
}
public String getClientEmailId() {
return clientEmailId;
}
public void setClientEmailId(String clientEmailId) {
this.clientEmailId = clientEmailId;
}
public Project getPrjName() {
return prjName;
}
public void setPrjName(Project prjName) {
this.prjName = prjName;
}

@Override
public String toString() {
return "Client[clientId= " +clientId+ ", clientName= " +clientName+ ", clientAddress= " +clientAddress+ ", clientEmaild= " +clientEmailId+
", projectName= " +prjName;
}

}
