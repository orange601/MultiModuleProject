package kr.chunlima.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.chunlima.api.aop.CheckAspect;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(CheckAspect.class);
	
	@GetMapping(value="/home")
	@ResponseBody
	public String home() {
		logger.info("home method on HomeController");
		return "OK";
	}
}


