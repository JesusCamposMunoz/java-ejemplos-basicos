package com.jesuscamposmunoz.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class TestControlador {

	@RequestMapping("/page1")
	public String printHello(ModelMap model) {
		model.addAttribute("messageSpring", "Hello Spring MVC Framework!");
		
		System.out.println("Ejecutando el controlador TestControlador");
		
		return "page2";
	}
	
	@RequestMapping("/pageA")
	public String printNewPage(ModelMap model) {
		model.addAttribute("messageSpring", "Hello Spring MVC Framework!");
		
		System.out.println("Ejecutando el controlador TestControlador - page A");
		
		return "pageB";
	}
}
