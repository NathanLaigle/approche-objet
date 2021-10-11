package fr.diginamic.salaire;

import java.util.Arrays;

public abstract class Intervenant {
	
	public Intervenant(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public abstract double getWage();
	
	/**
	 * Log info
	 */
	public void getInfo() {
		System.out.println(this.lastName + " " + this.firstName + " " + this.getWage() + " " + this.getClass().getSimpleName());
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String lastName;
	private String firstName;
}
