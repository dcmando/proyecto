package com.dwa.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dwa.proyecto.modelo.Persona;
import com.dwa.proyecto.servicios.PersonaServicio;

@Controller
public class PersonaController {

	@Autowired
	private PersonaServicio servicio;
	
	@GetMapping(path= {"/persona/validar", "/"})
	public String validar()
	{
		return "persona/validar";
	}
	
	@PostMapping("/persona/validar")
	public String validar(@RequestParam("razonsocial")String razonsocial, 
			@RequestParam("pass") String pass, Model modelo)
	{
		boolean res = servicio.validar(razonsocial, pass);
		if(res)
			{
				return "redirect:/home/principal";
			}
		
		modelo.addAttribute("error", servicio.getMensaje());
		modelo.addAttribute("razonsocial", razonsocial);
		modelo.addAttribute("pass", pass);
		return "/persona/validar";
	}
	
	@GetMapping("/persona/agregar")
	public String agregar(Model model)
	{
		model.addAttribute("persona", new Persona());
		return "persona/agregar";
	}
	
	@PostMapping("/persona/agregar")
	public String agregar(Model modelo, @ModelAttribute Persona soli)
	{
		boolean res= servicio.agregar(soli);
		if(res)
		{
			return "redirect:/persona/validar";
		}
		modelo.addAttribute("error", servicio.getMensaje());
		return "/persona/agregar";
	}
	
}
