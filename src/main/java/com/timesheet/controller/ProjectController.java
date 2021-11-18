package com.timesheet.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Project;
import com.timesheet.service.ProjectService;



@RestController
public class ProjectController {

@Autowired
private ProjectService projectService;


@GetMapping("/getAllProjects")
public ArrayList<Project> getAllProjects(){
return projectService.getAllProjects();
}

@GetMapping("/getProjectBrief")
public String GetProjectBrief(@RequestParam Long prjId) {
return projectService.getProjectBrief(prjId);
}

@PostMapping("/addPrj")
public void addPrj(@RequestBody Project project) {
projectService.insertPrj(project);
}

@PutMapping(value="/prj/updatePrj/{prjId}")
public void updatePrj(@RequestBody Project project ,@PathVariable Long prjId) {
projectService.updatePrj(project,prjId);
}
/*
@PostMapping("/insertProjectDates")
public void insertProjectDates(@RequestBody Date prjStartDate, Date prjEndDate) {
projectService.insertProjectDates(prjStartDate, prjEndDate);
}
*/

@GetMapping("/ProjectStatus")
public String ProjectStatus(@RequestParam Long prjId) {
return projectService.ProjectStatus(prjId);
}
}