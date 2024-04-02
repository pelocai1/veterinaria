package com.proyectoMio.veterinaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/WEB")
public class WEB {
	@GetMapping("")
	public String home() {
		return "WEB/home";
	}
}
