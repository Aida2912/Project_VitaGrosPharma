package com.saraya.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.Owner;
import com.saraya.model.Pet;
import com.saraya.model.PetType;
import com.saraya.model.Visit;
@Service
public class PetService {
	
	
	
	
	

	private static List<Pet> pets = new ArrayList<Pet>();
	private static int count= 10;
	
	


static {
	pets.add(new Pet(1, "LEO", LocalDate.of(20, 12, 13), new PetType("Cat"), new Visit( LocalDate.of(20, 12, 13), "childbirth")));
	pets.add(new Pet(1, "toutou", LocalDate.of(20, 12, 13), new PetType("bird"), new Visit( LocalDate.of(20, 12, 13), "wings break")));
	pets.add(new Pet(1, "dash", LocalDate.of(20, 12, 13), new PetType("dog"), new Visit( LocalDate.of(22, 2, 21), "sore throat")));
	pets.add(new Pet(1, "hilas", LocalDate.of(20, 12, 13), new PetType("Cat"), new Visit( LocalDate.of(20, 12, 9), "skin problem")));
	pets.add(new Pet(1, "Lamard", LocalDate.of(20, 12, 13), new PetType("hamster"), new Visit( LocalDate.of(21, 11, 3), "headache")));
	pets.add(new Pet(1, "Cams", LocalDate.of(20, 12, 13), new PetType("lizard"), new Visit( LocalDate.of(22, 9, 13), "skin respiratory")));
	pets.add(new Pet(1, "Emanuel", LocalDate.of(20, 12, 13), new PetType("Insects"), new Visit( LocalDate.of(21, 12, 23), "wings")));
	pets.add(new Pet(1, "Mauri", LocalDate.of(20, 12, 13), new PetType("Rodents"), new Visit( LocalDate.of(22, 5, 3), "descript")));
	pets.add(new Pet(1, "Nino", LocalDate.of(20, 12, 13), new PetType("Amphibians"), new Visit( LocalDate.of(21, 8, 1), "childbirth")));
	pets.add(new Pet(1, "Mino", LocalDate.of(20, 12, 13), new PetType("Cat"), new Visit( LocalDate.of(22, 2, 3), "respiratory respiratory")));
	
	
}
	
	
	
	public List<Pet> retrieveAllpets(){
		return pets;
	}
	
	

	public void addPet(String name, LocalDate dateofBirth, PetType petType, Visit visits) {
		pets.add(new Pet(++ count, name,  dateofBirth, petType, visits ));
	}
	
	public Pet petDetails(int id) {
		for(Pet pet :pets) {
			if (pet.getId()==id) {
				return pet;
			}
		}
		return null;
	}
	
	

	public void updatePet(Pet pet) {
		pets.remove(pet);
		pets.add( pet);
		

	}
	
	
	
	public Pet viewPet(int id) {
		Iterator<Pet> iterate= pets.iterator();
		while(iterate.hasNext()) {
			Pet pet = iterate.next();
			if(pet.getId() == id) {
			return pet;
			}
		}
		return null;
	}
	
}



