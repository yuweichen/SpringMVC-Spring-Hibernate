package org.cyw.ssh.service;

import org.cyw.ssh.model.vo.DataGrid;
import org.cyw.ssh.model.vo.Doc;

public interface DocServiceI {

	public void save(Doc doc);

	public void update(Doc doc);

	public void delete(String ids);

	public DataGrid datagrid(Doc doc);
	
	public void upload(Doc doc, String fileName);

}
