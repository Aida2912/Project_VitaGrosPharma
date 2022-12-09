package com.saraya.model;

import java.time.LocalDate;

public class Pet {
	
	private int id;
	
	private String   name;
	private LocalDate dateofBirth;
	private PetType petType;
	private Visit visits;
	

	public Pet() {
	}
	
	public Pet(int id ,String name, LocalDate dateofBirth, PetType petType, Visit visits) {
		super();
		this.id =id;
		
		this.name = name;
		this.dateofBirth = dateofBirth;
		this.petType = petType;
		this.visits = visits;
	}
	



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Visit getVisits() {
		return visits;
	}

	public void setVisits(Visit visits) {
		this.visits = visits;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", dateofBirth=" + dateofBirth + ", petType="
				+ petType + ", visits=" + visits + "]";
	}


	
	
	
	
	
	

}
