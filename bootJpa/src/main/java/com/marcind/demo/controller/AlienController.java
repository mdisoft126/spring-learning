package com.marcind.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController 
{
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
}
