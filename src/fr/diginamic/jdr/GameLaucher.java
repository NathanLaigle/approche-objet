package fr.diginamic.jdr;

import java.util.Scanner;

public class GameLaucher {

	private Team trainerTeam = new Team();

	private Pokemon wildPokemon;

	private boolean gameState;

	private boolean battleState;

	private Scanner scanner = new Scanner(System.in);

	public void start() {
		this.gameState = true;
		this.intro();
		while (this.gameState) {
			this.battle();
		}
	}

	private void intro() {
		System.out.println("hi trainer ! Choose 3 pokemons to start :");
		for (int i = 0; i < this.trainerTeam.getTeam().length; i++) {
			System.out.println("Name of pokemon number " + i + " :");
			String name = scanner.next();
			this.trainerTeam.addPokemon(new TrainerPokemon(name));
		}
		System.out.println("\nGreat this is your team: ");
		this.trainerTeam.showTeam();

		System.out.println("You must know that if one of your pokemon faints, you lose... no death is acceptable !");
	}

	private void battle() {
		System.out.println("\n");
		this.wildPokemonGenerator();
		System.out.println("A wild " + this.wildPokemon.name + " appeared !");
		this.battleState = true;
		while (this.battleState) {
			this.round();
			this.battleChecker();
		}
	}

	private void battleChecker() {
		if (this.wildPokemon.getLife() < 1) {
			System.out.println(this.wildPokemon.name + " fainted !");
			this.battleState = false;
			this.gameIncrementation();
		}
		if (this.trainerTeam.getLead().getLife() < 1) {
			this.battleState = false;
			this.gameState = false;
			
			System.out.println("You lose ! Your score is : " + this.trainerTeam.getPoints());
		}
	}

	private void gameIncrementation() {
		this.trainerTeam.addPoints(this.wildPokemon.getPoints());
		System.out.println("Your new score is : " + this.trainerTeam.getPoints());
		
		double randomPotionGiver = Math.random() * 5;
		if((int)randomPotionGiver == 0) {
			this.trainerTeam.addPotion();
			System.out.println("Oh ! You gain a potion !");
		}
	}

	private void round() {
		System.out.println("\n");
		System.out.println("What should " + this.trainerTeam.getLead().name + " do ?");
		System.out.println("0 : attack | 1 : use potion (" + this.trainerTeam.getPotions()
				+ ") | 2 : show team | 3 : switch pokemon");
		int action = this.scanner.nextInt();
		switch (action) {
		case 0:
			this.attackAction();
			break;
		case 1:
			this.usePotionAction();
			break;
		case 2:
			this.trainerTeam.showTeam();
			break;
		case 3:
			this.switchAction();
			break;
		default:
			System.out.println("Choose a correct action");
		}
	}

	private void attackAction() {
		int wildPokemonAttack = this.wildPokemon.attack();
		int trainerPokemonAttack = this.trainerTeam.getLead().attack();
		if (wildPokemonAttack > trainerPokemonAttack) {
			this.trainerTeam.getLead().looseLife(wildPokemonAttack - trainerPokemonAttack);
			int attack = wildPokemonAttack - trainerPokemonAttack;
			System.out.println(this.wildPokemon.name + " Attacks ! " + this.trainerTeam.getLead().name + " lose " + attack + " lifePoint(s)");
			System.out.println(this.trainerTeam.getLead().name + "'s lifePoint(s) : " + this.trainerTeam.getLead().getLife());
		} else if (wildPokemonAttack < trainerPokemonAttack) {
			this.wildPokemon.looseLife(trainerPokemonAttack - wildPokemonAttack);
			int attack = trainerPokemonAttack - wildPokemonAttack;
			System.out.println(this.trainerTeam.getLead().name + " Attacks ! Wild " + this.wildPokemon.name + " lose " + attack + " lifePoint(s)");
			System.out.println("Wild " + this.wildPokemon.name + "'s lifePoint(s) : " + this.wildPokemon.getLife());
		} else {
			System.out.println("It's a draw !");
		}
	}

	private void usePotionAction() {
		this.trainerTeam.usePotion();
	}

	private void switchAction() {
		this.trainerTeam.switchPokemon();
	}

	private void wildPokemonGenerator() {
		double generatorRand = Math.random() * 3;
		switch ((int)generatorRand) {
		case 0:
			this.wildPokemon = new Magikarp();
			break;
		case 1:
			this.wildPokemon = new Wailmer();
			break;
		case 2:
			this.wildPokemon = new Gyarados();
			break;
		}
	}
}
