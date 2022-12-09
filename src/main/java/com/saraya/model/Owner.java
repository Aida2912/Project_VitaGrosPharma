package com.saraya.model;

public class Owner {

	private int id;
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private int telephone;
	private Pet pets;
	
	public Owner() {
		
	}
	
	public Owner(int id, String firstname, String lastname, String address, String city, int telephone, Pet pets) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = pets;
		
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Pet getPets() {
		return pets;
	}

	public void setPets(Pet pets) {
		this.pets = pets;
		
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
		Owner other = (Owner) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", city=" + city + ", telephone=" + telephone + ", pets=" + pets + "]";
	}
	
	
	
	

}
