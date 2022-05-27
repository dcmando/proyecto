package com.dwa.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacturaController {
	@GetMapping("/factura/crear")
	public String crear() {
		return "factura/crear";
	}
}
