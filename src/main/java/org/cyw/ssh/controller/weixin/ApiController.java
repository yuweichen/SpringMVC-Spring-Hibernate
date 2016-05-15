package org.cyw.ssh.controller.weixin;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.cyw.ssh.controller.BaseController;
import org.cyw.ssh.wechat.Wechat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/WXApi/api")
public class ApiController extends BaseController {

	public static final Logger logger = Logger.getLogger(ApiController.class);

	@ResponseBody
	@RequestMapping(value = "/valid", method = RequestMethod.GET)
	public String valid(HttpServletRequest request) {

		Wechat wechat = new Wechat(request);
		String s = wechat.execute();
		System.err.println(s);
		//return s;
		return request.getParameter("echostr");
	}

}
