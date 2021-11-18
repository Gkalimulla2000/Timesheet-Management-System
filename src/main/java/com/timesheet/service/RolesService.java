package com.timesheet.service;

import java.util.List;

import com.timesheet.entity.Roles;



public interface RolesService {
public void insertRole(Roles role);
public List<Roles> getAllRoles();



}