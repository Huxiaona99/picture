package com.pzj.core.imgsrv.restful;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ImgLoginController {



	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String  upload(@RequestParam(required = false) String username,
			@RequestParam(required = false) String password, HttpServletRequest request) {

		return "success";
	}

}
