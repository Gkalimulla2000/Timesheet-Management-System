package com.timesheet.service;


import java.util.ArrayList;
import java.util.Date;

import com.timesheet.entity.Project;



public interface ProjectService {

public ArrayList<Project> getAllProjects();//
public void insertPrj(Project project);//
public void updatePrj(Project prj);//
public Enum ProjectStatus(Project p);
public void insertProjectDates(Date prjStartDate, Date prjEndDate);
public String getProjectBrief();//




}