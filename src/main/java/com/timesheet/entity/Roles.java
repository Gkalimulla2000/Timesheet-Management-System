package com.timesheet.entity;

import java.util.Arrays;
import java.util.List;

public class Roles {

	Long roleId;
	List<String> roleName=Arrays.asList("admin","projectManager","softwareEngineer");
	public Roles(Long roleId, List<String> roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	/**
	 * @return the roleId
	 */
	public Long getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the roleName
	 */
	public List<String> getRoleName() {
		return roleName;
	}
	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(List<String> roleName) {
		this.roleName = roleName;
	}
	
	
}
