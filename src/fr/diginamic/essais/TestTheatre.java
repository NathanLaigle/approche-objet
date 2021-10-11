package fr.diginamic.essais;

import fr.diginamic.banque.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Swwag", 120, 43, 172.00);
		theatre.subscribe(20, 4.0);
		theatre.subscribe(20, 4.0);
		theatre.subscribe(20, 4.0);
		theatre.subscribe(20, 4.0);
		theatre.subscribe(20, 4.0);
		theatre.subscribe(20, 4.0);

		System.out.println(theatre.getSubscribed());
		System.out.println(theatre.getTotalRevenues());
	}

}
