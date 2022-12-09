package com.saraya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.Owner;
import com.saraya.model.Speciality;
import com.saraya.model.Vet;

@Service
public class VetService {
	
	
	

	private static List<Vet> vet = new ArrayList<Vet>();
	private static int count= 5;
	

	
static {
	vet.add(new Vet(1, "James", "Carter", new Speciality("none")));
	vet.add(new Vet(1, "Linda", "Douglas", new Speciality("dentistry surgery")));
	vet.add(new Vet(1, "Helen", "Leary", new Speciality("none")));
	vet.add(new Vet(1, "Rafeal", "Ortega", new Speciality("radiologie")));
	vet.add(new Vet(1, "Henry", "Stevens", new Speciality("surgery")));
	
	;
}

	public List<Vet> retrieveAllVet(){
		return vet;
	}
	
	
	public void addVet(  int id, String firstname, String lastname, Speciality speciality) {
		vet.add(new Vet(++ count, lastname, lastname, speciality));
		
	}
	public Vet vetDetails(int id) {
		for(Vet vet :vet) {
			if (vet.getId()==id) {
				return vet;
			}
		}
		return null;
	}
}
	