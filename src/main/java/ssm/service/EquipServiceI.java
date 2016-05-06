package ssm.service;

import javax.servlet.http.HttpServletResponse;

import ssm.model.vo.DataGrid;
import ssm.model.vo.Equip;

public interface EquipServiceI {

	public void save(Equip equip);

	public void update(Equip equip);

	public void delete(String ids);

	public DataGrid datagrid(Equip equip);
	
	public void exportToExcelFile(HttpServletResponse response);

}
