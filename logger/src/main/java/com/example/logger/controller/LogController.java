package com.example.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testLogging")
public class LogController {
	
	
	Logger logger = LoggerFactory.getLogger(LogController.class);
	
	@RequestMapping(value="/testJson", method=RequestMethod.GET, produces="application/json")
	public String getMapJson() {
		
		logger.info("welcome() is executed raja -- info");
		return "workingFine";
	}

}
