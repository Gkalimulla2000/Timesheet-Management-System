package com.timesheet.dao;

import org.springframework.data.repository.CrudRepository;

import com.timesheet.entity.Project;

public interface ProjectRepository extends CrudRepository<Project ,Long> {

}
