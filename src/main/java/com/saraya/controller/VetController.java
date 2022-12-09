package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saraya.service.VetService;

@Controller
public class VetController {
	
	
	@Autowired
	VetService vetService;
	




	@RequestMapping(value = "/list-vet" , method = RequestMethod.GET)
	public String getAllVet(ModelMap model) {
		model.addAttribute("vet",vetService.retrieveAllVet() );
		return "Vet_list";
		
}
	}
