package com.timesheet.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Team")
public class Team {
	@Id
	Long teamId;
	String teamName;
	String teamLeader;
	String teamNotes;
	Project prjId;
	String teamMembers;
	public Team(Long teamId, String teamName, String teamLeader, String teamNotes, Project prjId, String teamMembers) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamLeader = teamLeader;
		this.teamNotes = teamNotes;
		this.prjId = prjId;
		this.teamMembers = teamMembers;
	}
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamLeader() {
		return teamLeader;
	}
	public void setTeamLeader(String teamLeader) {
		this.teamLeader = teamLeader;
	}
	public String getTeamNotes() {
		return teamNotes;
	}
	public void setTeamNotes(String teamNotes) {
		this.teamNotes = teamNotes;
	}
	public Project getPrjId() {
		return prjId;
	}
	public void setPrjId(Project prjId) {
		this.prjId = prjId;
	}
	public String getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(String teamMembers) {
		this.teamMembers = teamMembers;
	}
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamLeader=" + teamLeader + ", teamNotes="
				+ teamNotes + ", prjId=" + prjId + ", teamMembers=" + teamMembers + "]";
	}
	

}
