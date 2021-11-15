package com.timesheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Project;
import com.timesheet.service.EmployeeService;
import com.timesheet.service.ProjectService;

@RestController
public class SystemAdministrator {
	@Autowired
	private ProjectService projectService;
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value="/SA/getProject")
	public void addProject(@RequestBody Project project) {
		
		projectService.insertPrj(project);	
	}
	@GetMapping(value="/SA/getProjectStatus")
	public Enum getProjectStatus(@RequestParam Long prjId) {
		return projectService.ProjectStatus(prjId);
	}

}
