package ssm.service;

import java.util.List;

import ssm.model.vo.DataGrid;
import ssm.model.vo.Role;

public interface RoleServiceI {

	public void add(Role role);

	public void edit(Role role);

	public void delete(String ids);
	
	public DataGrid datagrid(Role role);
	
	public List<Role> combobox();

}
