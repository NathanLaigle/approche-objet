package fr.diginamic.salaire;

public class Employee extends Intervenant{
	
	public Employee(String lastName, String firstName, double wage){
		super(lastName, firstName);
		this.wage = wage;
	}
	
	public double getWage() {
		return this.wage;
	}
	
	private double wage;
}
