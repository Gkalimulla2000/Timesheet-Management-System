package com.timesheet.testcontroller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.timesheet.controller.ProjectController;
import com.timesheet.dao.ProjectRepository;
import com.timesheet.entity.Project;
import com.timesheet.service.ProjectService;

@SpringBootTest
class ProjectControllerTest {

	@Autowired
	private ProjectRepository projectRepository;

	@Test
	void addPrj() {
		// given
		Project project1 = new Project();
		project1.setPrjId(1l);
		project1.setPrjName("name");
		project1.setPrjAppServerId("123");
		project1.setPrjOsId("456");
		project1.setStatus("Running");
		project1.setPrjNotes("notes");

		projectRepository.save(project1);

		assertNotNull(projectRepository.findById(1l).get());

	}

	private void assertNotNull(Project project) {

	}
}
