package com.timesheet.dao;

import org.springframework.data.repository.CrudRepository;

import com.timesheet.entity.Team;

public interface TeamRepository extends CrudRepository<Team,Long> {

}
