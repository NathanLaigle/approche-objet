package fr.diginamic.jdr;

public abstract class Pokemon {
	

	protected String name;
	
	protected int maxAttack;
	protected int minAttack;
	private int attack;

	protected int maxLife;
	protected int minLife;
	private int life;
	
	public Pokemon(String name){
		this.name = name;
	}
	
	public int attack() {
		double attackNumber = this.attack + Math.random() * 10;
		return (int)attackNumber;
	}
	
	protected void setAttack() {
		double attack = Math.random() * (this.maxAttack - this.minAttack) + this.minAttack;
		this.attack = (int)attack;
	}

	protected void setLife() {
		double life = Math.random() * (this.maxLife - this.minLife) + this.minLife;
		this.life = (int)life;
	}
	
	public void heal(int lifePoints) {
		this.life += lifePoints;
	}
	
	public void looseLife(int lifePoints) {
		this.life -= lifePoints;
	}

	public int getAttack() {
		return attack;
	}

	public int getLife() {
		return life;
	}
	
	public abstract int getPoints();
}
