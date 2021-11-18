package com.timesheet.service;


import java.util.List;

import com.timesheet.entity.Project;



public interface ProjectService {

public List<Project> getAllProjects();//
public void insertPrj(Project project);//
public void updatePrj(Project prj,Long prjId);//
public String projectStatus(Long prjId);
public String getProjectBrief(Long prjId);//

}