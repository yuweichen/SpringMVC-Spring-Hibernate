package org.cyw.ssh.service;

import java.util.List;

import org.cyw.ssh.model.vo.DataGrid;
import org.cyw.ssh.model.vo.Role;

public interface RoleServiceI {

	public void add(Role role);

	public void edit(Role role);

	public void delete(String ids);
	
	public DataGrid datagrid(Role role);
	
	public List<Role> combobox();

}
