package com.timesheet.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



import com.timesheet.entity.TimeSheet;



public interface TimeSheetRepository extends CrudRepository<TimeSheet,Long>{
@Query("Select * from TimeSheet where e.empId='empid'")
void updateTimeSheet(TimeSheet TimeSheet);




}
