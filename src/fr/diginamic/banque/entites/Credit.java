package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(int date, int mount) {
		super(date, mount);
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {
		return "Credit";
	}

}
