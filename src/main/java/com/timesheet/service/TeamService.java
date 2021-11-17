package com.timesheet.service;

import java.util.List;

import com.timesheet.entity.Employee;
import com.timesheet.entity.Team;

public interface TeamService {

	String addEmpToTeam(List<Employee> employee, Long teamId);

	List<Team> getTeamMembers();
	public String assignRole(Team team);
}
