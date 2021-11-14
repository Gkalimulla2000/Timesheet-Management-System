package com.timesheet.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.timesheet.entity.Project;
import com.timesheet.service.ProjectService;



@RestController
public class ProjectController {

@Autowired
private ProjectService ProjectService;


@GetMapping("/getAllProjects")
public ArrayList<Project> getAllProjects(){
return ProjectService.getAllProjects();
}

@GetMapping("/getProjectBrief")
public String GetProjectBrief() {
return ProjectService.getProjectBrief();
}

@PostMapping("/addPrj")
public void addPrj(@RequestBody Project prj) {
ProjectService.insertPrj(prj);
}

@PutMapping(value="/prj/updatePrj")
public void updatePrj(@RequestBody Project prj) {
ProjectService.updatePrj(prj);
}

@PostMapping()
public void insertProjectDates(@RequestBody Date prjStartDate, Date prjEndDate) {
ProjectService.insertProjectDates(prjStartDate, prjEndDate);
}

@PutMapping()
public void ProjectStatus(@RequestBody Project projectStatus) {
ProjectService.ProjectStatus(projectStatus);
}





}