package fr.diginamic.banque.entites;

public class AccountRate extends Account {
	
	private float rate;
	
	public AccountRate(int accountNumber, int accountMount, float rate){
		super(accountNumber, accountMount);
		this.rate = rate;
	}
	
	public String toString() {
		return super.toString() + "\ntaux : " + this.rate;
	}
	
	public float getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
}
