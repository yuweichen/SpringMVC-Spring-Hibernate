package org.cyw.ssh.controller.weixin;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.cyw.ssh.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sword.wechat4j.menu.Menu;
import org.sword.wechat4j.menu.MenuManager;
import org.sword.wechat4j.token.TokenProxy;

@Controller
@RequestMapping("/WXApi/demo")
public class DemoController extends BaseController {

	public static final Logger logger = Logger.getLogger(DemoController.class);

	@ResponseBody
	@RequestMapping(value = "menu")
	public Menu menu(HttpServletRequest request) {
		MenuManager manager = new MenuManager();
		System.err.println(TokenProxy.accessToken());
		Menu menu = manager.getMenu();
		System.err.println(menu);
		return menu;
	}

}
