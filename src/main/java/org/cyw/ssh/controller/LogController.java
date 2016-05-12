package org.cyw.ssh.controller;

import org.apache.log4j.Logger;
import org.cyw.ssh.controller.BaseController;
import org.cyw.ssh.model.vo.DataGrid;
import org.cyw.ssh.model.vo.Log;
import org.cyw.ssh.service.LogServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/logController")
public class LogController extends BaseController{

	private static final Logger logger = Logger.getLogger(LogController.class);
	
	@Autowired
	private LogServiceI logService;

	@RequestMapping("/log")
	public String log() {
		return "/admin/log";
	}
	
	@ResponseBody
	@RequestMapping("/datagrid")
	public DataGrid datagrid(Log log) {
		return logService.datagrid(log);
	}
}
