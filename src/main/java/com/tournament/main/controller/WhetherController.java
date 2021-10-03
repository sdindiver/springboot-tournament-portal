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
		System.out.println("fourth commit");
		System.out.println("branch-1 first commit");
		System.out.println("branch-1 second commit");
		System.out.println("branch-1 1-B commit");



	}
	
	public WhetherController(){
		
	}

	@RequestMapping(value="/status",method=RequestMethod.GET)
	public String status(){
		return "30 degree";
		
	}
}
