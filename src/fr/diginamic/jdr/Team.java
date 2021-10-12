package fr.diginamic.jdr;

import java.util.Scanner;

public class Team {
	
	private int potions = 0;
	
	private int points = 0;
	
	private Pokemon[] team = new Pokemon[3];
	
	private int pokemonGeneratorIndex = 0;
	
	private Pokemon lead;
	
	private Scanner scanner = new Scanner(System.in);
	
	public void addPokemon(Pokemon pokemon) {
		if (this.pokemonGeneratorIndex < this.team.length) {
			this.team[this.pokemonGeneratorIndex] = pokemon;
			if (this.pokemonGeneratorIndex == 0) {
				this.lead = this.team[0];
			}
			this.pokemonGeneratorIndex ++;
		} else {
			System.out.println("Your team is full");
		}
	}
	
	public void switchPokemon() {
		System.out.println("Which pokemon do you want to send to battle ?");
		this.showTeam();
		
		boolean switchCheck = false;
		
		while(!switchCheck) {
			int pokemonTeamIndex = this.scanner.nextInt();
			
			if(pokemonTeamIndex < 3 && pokemonTeamIndex >= 0) {
				this.lead = this.team[pokemonTeamIndex];
				switchCheck = true;
			} else {
				System.out.println("You must choose a pokemon with a correct index...");
			}
		}
		
		System.out.println(this.lead.name + " is sent to the battle !");
		
	}
	
	public void addPoints(int points) {
		this.points += points;
	}
	
	public void addPotion() {
		this.potions ++;
	}
	
	public void usePotion() {
		System.out.println("On which pokemon should you use a potion ?");
		this.showTeam();
		int pokemonTrainerTeamIndex = this.scanner.nextInt();
		if(pokemonTrainerTeamIndex < this.getTeam().length && pokemonTrainerTeamIndex >= 0) {
			if(this.getPotions() > 0) {
				this.team[pokemonTrainerTeamIndex].heal(10);
				System.out.println("A potion has been used ! " + this.getTeam()[pokemonTrainerTeamIndex].name + " seems to be better now !");
			} else {
				System.out.println("You do not have any potions");
			}
		} else {
			System.out.println("you must choose a valid pokemon");
		}
	}
	
	public void showTeam() {
		System.out.println("Your team :");
		for(int i = 0 ; i < this.team.length; i ++) {
			System.out.println(i + " | " +this.team[i].name + " | life: " + this.team[i].getLife() + " | attack: " + this.team[i].getAttack());
		}
	}
	
	public Pokemon[] getTeam() {
		return this.team;
	}
	
	public Pokemon getLead() {
		return this.lead;
	}
	
	public int getPotions() {
		return this.potions;
	}
	
	public int getPoints() {
		return this.points;
	}
}
