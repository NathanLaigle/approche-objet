package fr.diginamic.banque.entites;

public class Account {
	
	public int accountNumber;
	public int accountMount;
	
	public Account(int accountNumber, int accountMount){
		this.accountMount = accountMount;
		this.accountNumber = accountNumber;
	}
	
	public String toString() {
		return "number : " + this.accountNumber + "\nmount : "+ this.accountMount;
	}
}
