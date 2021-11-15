package com.timesheet.dao;

import org.springframework.data.repository.CrudRepository;

import com.timesheet.entity.Leave;

public interface LeaveRepository extends CrudRepository<Leave ,Long>{

}
