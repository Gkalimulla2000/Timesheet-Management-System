package com.timesheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Employee;
import com.timesheet.entity.Roles;
import com.timesheet.entity.Team;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.ProjectService;
import com.timesheet.service.RolesService;
import com.timesheet.service.TeamService;

@RestController
public class ProjectManagerController {
	@Autowired
	private ProjectService projectService;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private RolesService rolesService;
	@Autowired
	private TeamService teamService;

	@RequestMapping(value = "/addEmpToTeam/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addEmpToTeam(@RequestBody List<Employee> employee, @RequestParam Long teamId) {
		return teamService.addEmpToTeam(employee, teamId);

	}
//@RequestMapping(value = "/payments", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//public @ResponseBody List<Payment> batchCreate(@RequestBody List<Payment> payments) {
//return paymentService.create(payments);
//}

	@GetMapping("/getTeamMembers/")
	public List<Team> getTeamMembers() {
		return teamService.getTeamMembers();
	}

	@PostMapping("/PM/InsertRoles")
	public void insertRole(@RequestBody Roles role) {
		rolesService.insertRole(role);

	}

	@GetMapping("/PM/getProjectBrief")
	public String GetProjectBrief(@RequestParam Long prjId) {
		return projectService.getProjectBrief(prjId);
	}

	@PostMapping(value = "/PM/emp/changePassword/{empId}")
	@ResponseBody
	public void changePassword(@RequestParam String empPassword, @PathVariable Long empId) {
		employeeService.changePassword(empPassword, empId);

	}
	
//	@GetMapping("/assignRoles")
//		public String assignRoles(@RequestBody Team team) {
//			return teamService.assignRole(team);
//		}
//	

}