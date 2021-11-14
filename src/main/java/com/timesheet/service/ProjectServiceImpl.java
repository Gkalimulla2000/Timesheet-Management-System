package com.timesheet.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.ProjectRepository;
import com.timesheet.entity.Project;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository ProjectRepository;
	@Override
	public ArrayList<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return (ArrayList<Project>) ProjectRepository.findAll();
	}

	@Override
	public void insertPrj(Project project) {
		// TODO Auto-generated method stub
		ProjectRepository.save(project);
	}

	@Override
	public void updatePrj(Project prj) {
		// TODO Auto-generated method stub
		ProjectRepository.save(prj);
	}

	@Override
	public Enum ProjectStatus(Project p) {
		
		return p.getStatus();
		
		
	}

	@Override
	public void insertProjectDates(Date prjStartDate, Date prjEndDate) {
		// TODO Auto-generated method stub
		Project p=new Project();
		p.setPrjStartDate(prjStartDate);
		p.setPrjEndDate(prjEndDate);
		
		ProjectRepository.save(p);
		
	}

	@Override
	public String getProjectBrief() {
		// TODO Auto-generated method stub
		Project p=new Project();
		return p.getPrjClientBrief();
	}

}
