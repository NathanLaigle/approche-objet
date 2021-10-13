package fr.diginamic.jdr;

public class Gyarados extends Pokemon {

	private int points = 5;

	public Gyarados() {
		super("Gyarados");

		this.minAttack = 12;
		this.maxAttack = 14;

		this.minLife = 20;
		this.maxLife = 30;
		
		super.setAttack();
		super.setLife();

	}

	public int getPoints() {
		return points;
	}
}
