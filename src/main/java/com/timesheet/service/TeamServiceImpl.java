package com.timesheet.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.EmployeeRepository;
import com.timesheet.dao.RolesRepository;
import com.timesheet.dao.TeamRepository;
import com.timesheet.entity.Employee;
import com.timesheet.entity.Roles;
import com.timesheet.entity.Team;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{
	@Autowired
	private TeamRepository teamRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private RolesRepository rolesRepository;
	Team teamObj=new Team();
	@Override
	public String addEmpToTeam(List<Employee> employee, Long teamId) {
		teamObj.setTeamId(teamId);
		teamObj.setTeamMembers(employee);
		teamRepository.save(teamObj);
		return "added to Team";
	}
//	@Override
//	public List<Employee> getTeamMembers(Long teamId) {
//		List<Employee> emp = null;
//		Optional<Team> team=teamRepository.findById(teamId);
//		if(team.isPresent()) {
//			 emp=teamObj.getTeamMembers();
//		}
//		return emp;
//	}
	
	@Override
	public List<Team> getTeamMembers() {
		
	
		return  (List<Team>) teamRepository.findAll();
		
	}
	
	public String assignRole(Team team) {
		List<Employee> employee=team.getTeamMembers();
		Roles roles=(Roles) rolesRepository.findAll();
		for(Employee e:employee) {
			
			e.setRole(roles);
		}
		return "assigned roles";
	}
	
}
