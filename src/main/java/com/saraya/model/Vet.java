package com.saraya.model;

public class Vet {
	
	private int id;
	private String firstname;
	private String lastname;
	private Speciality speciality;
	
	
	public Vet(int id, String firstname, String lastname, Speciality speciality) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.speciality = speciality;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Speciality getSpeciality() {
		return speciality;
	}


	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
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
		Vet other = (Vet) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Vet [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", speciality=" + speciality
				+ "]";
	}
	


	

	}
	
	
	
