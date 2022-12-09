package com.saraya.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.Owner;
import com.saraya.model.Pet;
import com.saraya.model.PetType;
@Service
public class OwnerService {
	

	private static List<Owner> owners = new ArrayList<Owner>();
	private static int count= 10;
	
	


static {
	owners.add(new Owner(1,"Georges", "Franklin",  "110 W.Lierty St", "Modison", 608551023, new Pet(1,"Leo", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	owners.add(new Owner(2,"Betty", "Davis",  "638 Cardinal Ave.", "Sun Prairie", 620591029, new Pet(1,"Basil", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	owners.add(new Owner(3,"Eduard", "Rodrigez",  "110 W.Lierty St", "McFarland", 658551033, new Pet(1,"Jewel Rosy", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	owners.add(new Owner(4,"Harol", "Davis",  "110 Friendly St", "Windsor", 604551001, new Pet(1,"Iggy", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	owners.add(new Owner(5,"Peter", "MvcTavish",  "110 S.Fair way", "Madison", 628551080, new Pet(1,"George", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	owners.add(new Owner(6,"Jean", "Coleman",  "105 N.Lake St.", "Monona", 613551055, new Pet(1,"Max Samantha", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	owners.add(new Owner(7,"Jeff", "Black",  "1450 Oak Blvd", "Monona", 600591025, new Pet(1,"Lucky", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	owners.add(new Owner(8,"Maria", "Escoito",  "345 Maple St", "Madison", 609501092, new Pet(1,"Mulligan", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	owners.add(new Owner(9,"David", "Schroeder",  "2749 lackhwk Trall", "Madison", 608231921, new Pet(1,"Freddy", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	owners.add(new Owner(10,"Carlos", "Estaban",  "2335 Independence.La", "waunekee", 608451029, new Pet(1,"Lucky Sly", LocalDate.of(20, 12, 13),new PetType("Cat"),null)));
	
	
	
}

	
	public List<Owner> retrieveAllowners(){
		return owners;
	}
	
	public void addOwner( String firstname, String lastname, String address, String city, int telephone, Pet pets) {
		owners.add(new Owner(++ count, firstname, lastname, address, city, telephone, pets ));
	}
	
	

	public void updateOwner(Owner owner) {
		owners.remove(owner);
		owners.add(owner);
	}
	
	public Owner ownerDetails(int id) {
		for(Owner owner :owners) {
			if (owner.getId()==id) {
				return owner;
			}
		}
		return null;
	}
	
	
	
	
	public Owner viewOwner(int id) {
		Iterator<Owner> iterate= owners.iterator();
		while(iterate.hasNext()) {
			Owner owner = iterate.next();
			if(owner.getId() == id) {
				return owner;
			}
		}
		return null;
	}
	


public List<Owner> searchO(String firstname) {
    
    List<Owner> owne = new ArrayList<Owner>();
    
    for(Owner owner:owners) {
      
        if(owner.getFirstname().toLowerCase().equals(firstname.toLowerCase()))
          owne.add(owner);
      }
    
    return  owne;
      
  }
}