package fr.diginamic.jdr;

public class TrainerPokemon extends Pokemon {
	
	public TrainerPokemon(String name) {
		super(name);
		
		this.minAttack = 12;
		this.maxAttack = 18;
		
		this.minLife = 20;
		this.maxLife = 50;
		
		super.setAttack();
		super.setLife();
		
	}
	
	public int getPoints(){
		return 0;
	}
}
