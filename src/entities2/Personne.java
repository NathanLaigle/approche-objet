package entities2;

import entities.AdressePostale;

public class Personne {
	
	Personne(String lastName, String firstName){
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	Personne(String lastName, String firstName, AdressePostale address){
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println(this.firstName + this.lastName.toUpperCase());
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public void setAddress(AdressePostale address) {
		this.address = address;
	}
	
	public AdressePostale getAddress() {
		return this.address;
	}
	
	private String lastName;
	private String firstName;
	private AdressePostale address;
}
