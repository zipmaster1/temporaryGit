package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CameraController {

	@Value("${market.type}")
	private String marketType;
	
	@Value("${db.server.ip}")
	private String dbServer;
	
	@Value("${user}")
	private String user;
	
	@RequestMapping(value="/camera/viewconfiguration", method=RequestMethod.GET)
	public String viewConfiguration() {
		return marketType + " // " + dbServer + " // " + user;
	}
}
