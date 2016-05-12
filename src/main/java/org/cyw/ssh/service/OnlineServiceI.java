package org.cyw.ssh.service;

import org.cyw.ssh.model.vo.DataGrid;
import org.cyw.ssh.model.vo.Online;

public interface OnlineServiceI {

	public void saveOrUpdateTonlineByLoginNameAndIp(String loginName, String ip);

	public void deleteTonlineByLoginNameAndIp(String loginName, String ip);

	public DataGrid datagrid(Online online);

}
