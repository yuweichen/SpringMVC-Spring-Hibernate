package ssm.controller.weixin;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.controller.BaseController;

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
