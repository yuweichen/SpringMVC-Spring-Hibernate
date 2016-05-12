package org.cyw.ssh.controller.weixin;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.cyw.ssh.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/WXApi/api")
public class ApiController extends BaseController {

	public static final Logger logger = Logger.getLogger(ApiController.class);

	@ResponseBody
	@RequestMapping("/valid")
	public String valid(HttpServletRequest request) {
		System.err.println("-------"+request.getAttribute("echostr"));
		return UUID.randomUUID().toString();
	}
	
}
