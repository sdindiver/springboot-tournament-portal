package com.tournament.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class WhetherController {
	
	static{
		System.out.println("WhetherController has been loaded");
		System.out.println("second commit");
	}
	
	public WhetherController(){
		
	}

	@RequestMapping(value="/status",method=RequestMethod.GET)
	public String status(){
		return "30 degree";
		
	}
}
