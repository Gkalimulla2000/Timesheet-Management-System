package com.timesheet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.EmployeeRepository;
import com.timesheet.dao.LeaveRepository;
import com.timesheet.entity.Employee;
import com.timesheet.entity.Leave;
@Service
public class LeaveServiceImpl implements LeaveService{
	@Autowired
	private LeaveRepository LeaveRepository;
	@Autowired
	private EmployeeRepository EmployeeRepository;
	@Override
	public void applyLeave(Leave leave) {
		
		LeaveRepository.save(leave);
	}
	public List<Leave> getAllLeave() {
		return (List<Leave>) LeaveRepository.findAll();
	}
	@Override
	public List<Leave> getEmpLeave(Long empId) {
		Employee emp=new Employee();
		
		
		
		return null;
	}
	

}
