package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison = new Maison();

		// etage 0
		maison.ajouterPiece(new Chambre(12.23, 0));
		maison.ajouterPiece(new Chambre(14.02, 0));
		maison.ajouterPiece(new Cuisine(15.98, -2));
		maison.ajouterPiece(new Salon(45.87, 0));
		maison.ajouterPiece(new SalleDeBain(16.04, 0));
		maison.ajouterPiece(new WC(4.65, 0));
		
		// etage 1
		maison.ajouterPiece(new Chambre(-18.43, 1));
		maison.ajouterPiece(new SalleDeBain(15.00, 1));
		
		maison.ajouterPiece(null);
		
		System.out.println("Superficie totale: " + maison.getSuperficieTotale());
		System.out.println("Superficie etage 0: " + maison.getSuperficieEtage(0));
		System.out.println("Superficie etage 1: " + maison.getSuperficieEtage(1));
		System.out.println("Superficie WC: " + maison.getSuperficiePieces("WC"));
		System.out.println("Superficie Chambre: " + maison.getSuperficiePieces("Chambre"));
		System.out.println("Nombre de pièces: " + maison.getNombreDePiece(null));
		System.out.println("Nombre de salles de bains: " + maison.getNombreDePiece("SalleDeBain"));
		
		
	}

}
