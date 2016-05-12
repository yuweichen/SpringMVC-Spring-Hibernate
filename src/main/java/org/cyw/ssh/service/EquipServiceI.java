package org.cyw.ssh.service;

import javax.servlet.http.HttpServletResponse;

import org.cyw.ssh.model.vo.DataGrid;
import org.cyw.ssh.model.vo.Equip;

public interface EquipServiceI {

	public void save(Equip equip);

	public void update(Equip equip);

	public void delete(String ids);

	public DataGrid datagrid(Equip equip);
	
	public void exportToExcelFile(HttpServletResponse response);

}
