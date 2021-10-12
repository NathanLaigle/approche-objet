package fr.diginamic.jdr;

public class Wailmer extends Pokemon {

	private int points = 2;

	public Wailmer() {
		super("Wailmer");

		this.minAttack = 8;
		this.maxAttack = 12;

		this.minLife = 10;
		this.maxLife = 15;
		
		super.setAttack();
		super.setLife();

	}

	public int getPoints() {
		return points;
	}
}
