package fr.diginamic.salaire;

public class Freelancer extends Intervenant{

	public Freelancer(String lastName, String firstName, double wage, int workingDays){
		super(lastName, firstName);
		this.wage = wage;
		this.workingDays = workingDays;
	}
	
	public double getWage() {
		return this.wage * this.workingDays;
	}
	
	private double wage;
	
	private int workingDays;
	
}
