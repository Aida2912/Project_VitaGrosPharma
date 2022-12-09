package com.saraya.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.Pet;
import com.saraya.service.PetService;

@Controller

public class PetController {
	
	@Autowired
	PetService petService;
	

	@RequestMapping(value = "/list-pet" , method = RequestMethod.GET)
	public String getAllPet(ModelMap model) {
		model.addAttribute("pets",petService.retrieveAllpets());
		return "ListPet_page";
		
		
	}
	
	@RequestMapping(value = "/new_pet" , method= RequestMethod.GET)
	public String addPet(ModelMap model) {
	model.addAttribute("pets", new Pet());
		return "new_pet";
		
	}

	

	@RequestMapping(value = "/new_pet" , method= RequestMethod.POST)
	public String addPet(@Valid Pet pets, BindingResult result) {
		if(result.hasErrors()) 
			return "new_pet";
		petService.addPet(pets.getName(), pets.getDateofBirth(),pets.getPetType(), pets.getVisits());
		return "redirect:/ListPet_page";
	}
	
	
	@RequestMapping(value = "/update-Pet", method = RequestMethod.GET)
	public String updatePet(@RequestParam int id,ModelMap model) {
		model.addAttribute("pets", petService.viewPet(id));
	return "new_pet";
	}
	
	@RequestMapping(value = "/update-Pet" , method= RequestMethod.POST)
	public String updatePet(@Valid Pet pet, BindingResult result) {
		if(result.hasErrors()) {
			return "new_pet";
		}
		
		petService.updatePet(pet );
		return "redirect:/ListPet_page";
}
	
	@RequestMapping(value="/pet-details", method=RequestMethod.GET)
		public String petDetails(@RequestParam int id, ModelMap model) {
		model.addAttribute("petdetail", petService.viewPet(id));
		return "Pet_details";
		
	}
}


