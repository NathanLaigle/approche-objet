package fr.diginamic.chaines;

import java.util.Arrays;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		
		System.out.println("Nombre de caractères: " + chaine.length());
		
		System.out.println("Index première lettre C: " + chaine.indexOf('c'));
		
		String lastName = chaine.substring(0, chaine.indexOf(';'));
		
		System.out.println("Nom de famille: " + lastName);
		
		System.out.println(lastName.toUpperCase());
		System.out.println(lastName.toLowerCase());

		String[] splittedString = chaine.split(";");
		
		System.out.println(Arrays.toString(splittedString));
	}

}
