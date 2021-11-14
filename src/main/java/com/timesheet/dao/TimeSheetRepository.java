package com.timesheet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.timesheet.entity.Employee;
import com.timesheet.entity.TimeSheet;



public interface TimeSheetRepository extends CrudRepository<TimeSheet,Long>{


//void save(Employee empId, String prjName, String date, List<Integer> tsNoOfHrs, String typeOfWork, String discription);

//void save(String date, Employee empId, String prjName);




}
