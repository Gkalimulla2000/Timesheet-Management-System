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
	private ProjectRepository projectRepository;

	@Override
	public ArrayList<Project> getAllProjects() {

		return (ArrayList<Project>) projectRepository.findAll();
	}

	@Override
	public void insertPrj(Project project) {

		projectRepository.save(project);
	}

	@Override
	public void updatePrj(Project prj) {

		projectRepository.save(prj);
	}

	@Override
	public String ProjectStatus(Long prjId) {
		Project p = projectRepository.findById(prjId).get();

		return projectRepository.save(p).getStatus();

	}

	@Override
	public void insertProjectDates(Date prjStartDate, Date prjEndDate) {
		Project p = new Project();
		p.setPrjStartDate(prjStartDate);
		p.setPrjEndDate(prjEndDate);
		projectRepository.save(p);

	}

	@Override
	public String getProjectBrief(Long prjId) {
		Project p =projectRepository.findById(prjId).get();
		
		return projectRepository.save(p).getPrjClientBrief();
	}

}
