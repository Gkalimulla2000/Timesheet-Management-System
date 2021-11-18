package com.timesheet.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Team")
public class Team {
	@Id
	@Column(name="TEAM_ID",length=10)
	private Long teamId;
	@Column(name="TEAM_NAME",length=20)
	private String teamName;
	@Column(name="TEAM_LEADER",length=20)
	private String teamLeader;
	@Column(name="TEAM_NOTES",length=50)
	private String teamNotes;
	@OneToOne
	@JoinColumn(name="TEAM_PROJ")
	private Project prjId;
	@OneToMany
	@JoinColumn(name="Team_Members")
	private List<Employee> teamMembers;
	
	public Team() {
		super();
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
	public List<Employee> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<Employee> teamMembers) {
		this.teamMembers = teamMembers;
	}
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamLeader=" + teamLeader + ", teamNotes="
				+ teamNotes + ", prjId=" + prjId + ", teamMembers=" + teamMembers + "]";
	}
	

}
