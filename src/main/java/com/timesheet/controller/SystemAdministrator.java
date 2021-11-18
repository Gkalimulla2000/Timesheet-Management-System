package com.timesheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Project;
import com.timesheet.service.ProjectService;

@RestController
public class SystemAdministrator {
	@Autowired
	private ProjectService projectService;	
	
	@PostMapping(value="/SA/getProject")
	public void addProject(@RequestBody Project project) {
		
		projectService.insertPrj(project);	
	}
	@GetMapping(value="/SA/getProjectStatus")
	public String getProjectStatus(@RequestParam Long prjId) {
		return projectService.projectStatus(prjId);
	}
	@GetMapping(value="/SA/getProjectDescription")
	public String getProjectDescription(@RequestParam Long prjId) {
		
		return projectService.getProjectBrief(prjId);
	}

}
