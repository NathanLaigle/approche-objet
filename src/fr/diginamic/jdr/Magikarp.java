package fr.diginamic.jdr;

public class Magikarp extends Pokemon {

	private int points = 1;

	public Magikarp() {
		super("Magikarp");

		this.minAttack = 5;
		this.maxAttack = 10;

		this.minLife = 5;
		this.maxLife = 10;
		
		super.setAttack();
		super.setLife();

	}

	public int getPoints() {
		return points;
	}

}
