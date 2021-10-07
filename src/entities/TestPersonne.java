package entities;

import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne gugus = new Personne();
		gugus.address = new AdressePostale();
		gugus.firstName = "Gugus";
		gugus.lastName = "LeSuperNomMegaTropChouette";
		
		Personne mec = new Personne();
		mec.address = new AdressePostale();
		mec.firstName = "Mec";
		mec.lastName = "LeBonVieuxRandom";
	}

}
