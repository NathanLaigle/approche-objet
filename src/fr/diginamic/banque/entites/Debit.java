package fr.diginamic.banque.entites;

public class Debit extends Operation{

	public Debit(int date, int mount) {
		super(date, mount);
		// TODO Auto-generated constructor stub
	}

	
	public String getType() {
		return "Debit";
	}
}
