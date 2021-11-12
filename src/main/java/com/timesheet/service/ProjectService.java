package com.timesheet.service;


import java.util.ArrayList;



import com.timesheet.entity.Project;



public interface ProjectService {

public ArrayList<Project> getAllProjects();//
public void insertPrj(Project project);//
public void updatePrj(Project prj);//
public void ProjectStatus(Project p);
public void insertProjectDates(Project prjStartDate, Project prjEndDate);
public String getProjectBrief();//




}