package com.timesheet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.ProjectRepository;
import com.timesheet.entity.Project;
import com.timesheet.exception.NoProjectFoundException;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	public static final String NO_RECORD_FOUND="No Record Found" ;
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<Project> getAllProjects() {

		return (List<Project>) projectRepository.findAll();
	}

	@Override
	public void insertPrj(Project project) {

		projectRepository.save(project);
	}

	@Override
	public void updatePrj(Project prj,Long prjId) {
 Optional<Project> proj=projectRepository.findById(prjId);
 if(proj.isPresent())
 {
 projectRepository.delete(proj.get());
		projectRepository.save(prj);
 }
 else
			throw new NoProjectFoundException(NO_RECORD_FOUND);
	}

	@Override
	public String projectStatus(Long prjId) {
		Optional<Project> p = projectRepository.findById(prjId);
		if(p.isPresent())
		{

		return projectRepository.save(p.get()).getStatus();
		}
		else 
			throw new NoProjectFoundException(NO_RECORD_FOUND);

	}

	

	@Override
	public String getProjectBrief(Long prjId) {
		Optional<Project> p =projectRepository.findById(prjId);
		if(p.isPresent())
			
		{ 
			return projectRepository.save(p.get()).getPrjClientBrief();
		}
		
		else 
			throw new NoProjectFoundException(NO_RECORD_FOUND);
		
				
	}

}
