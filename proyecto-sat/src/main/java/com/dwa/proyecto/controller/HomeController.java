package com.dwa.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home/principal")
	public String home() {
		return "home/principal";
	}
}
