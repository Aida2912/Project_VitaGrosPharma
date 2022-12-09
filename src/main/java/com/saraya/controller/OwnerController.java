package com.saraya.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.Owner;
import com.saraya.service.OwnerService;
import com.saraya.service.PetService;
import com.saraya.service.VetService;

@Controller
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	@Autowired
	PetService petService;
	@Autowired
	VetService vetService;
	
	
	
	
	

	@RequestMapping(value = "/list-owner" , method = RequestMethod.GET)
	public String getAllOwners(ModelMap model) {
		model.addAttribute("owners",ownerService.retrieveAllowners());
		
		return "ListOwner_page";
		
		
	}
	
	@RequestMapping(value = "/add_Owners" , method= RequestMethod.GET)
	public String addOwner(ModelMap model) {
		model.addAttribute("owners", new Owner());
		return "add_Owners";
		
	}

	@RequestMapping(value = "/add_Owners" , method= RequestMethod.POST)
	public String addOwner(@Valid Owner owners, BindingResult result) {
		if(result.hasErrors()) 
			return "add_Owners";

		ownerService.addOwner(owners.getFirstname(), owners.getLastname(), owners.getAddress(),
				owners.getCity(),owners.getTelephone(), null);
		return "redirect:/ListOwner_page";
	}
	
	
	
	@RequestMapping(value = "/update-Owner", method = RequestMethod.GET)
	public String updateOwner(@RequestParam int id,ModelMap model) {
		model.addAttribute("owners", ownerService.viewOwner(id));
	return "edit_Owners";
	}
	

	
	@RequestMapping(value = "/update-Owner" , method= RequestMethod.POST)
	public String updatedOwner(@Valid Owner owner, BindingResult result) {
		if(result.hasErrors()) {
			return "edit_Owners";
		}
		
		ownerService.updateOwner(owner );
		return "redirect:/ListOwner_page";
}

	@RequestMapping(value = "/edit-Owner", method = RequestMethod.GET)
	public String editOwner(@RequestParam int id,ModelMap model) {
		model.addAttribute("owners", ownerService.viewOwner(id));
		model.addAttribute("pet", petService.petDetails(id));
		model.addAttribute("vet", vetService.vetDetails(id));
		
		
	return "edit_Owners";
	}
	
	
	@RequestMapping(value="/Owner-details", method=RequestMethod.GET)
		public String ownerDetails(@RequestParam int id, ModelMap model) {
		model.addAttribute("owner", ownerService.ownerDetails(id));
		model.addAttribute("pet", petService.petDetails(id));
		model.addAttribute("vet", vetService.vetDetails(id));
		
		
		return "Owners_details";
		
	}


    public String ownList(ModelMap model) {
        model.addAttribute("owners", ownerService.retrieveAllowners());
       
        return "ListOwner_page";
    }
    
    @GetMapping("/search")
    public String search(@RequestParam String searchname, ModelMap model) {
      
      if(searchname.equals("")) {
        return  ownList(model);
        
      }
      else {
        model.put("owners", ownerService.searchO(searchname));
        return "Owner_Search_page";
      }
    }
}





	