package com.timesheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timesheet.dao.RolesRepository;
import com.timesheet.entity.Roles;



@Service
public class RolesServiceImpl implements RolesService {
@Autowired
private RolesRepository rolesRepository;
Roles roles=new Roles();
@Override
public void insertRole(Roles roles) {
	
//	roles.setRoleId(RoleId);
//	roles.setRoleName(RoleName);
rolesRepository.save(roles);
}
public List<Roles> getAllRoles(){
	
return(List<Roles>) rolesRepository.findAll();
}


}