package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison[] saison = Saison.values();
		
		for(Saison s : saison) {
			//System.out.println(s.getNom());
		}
		
		Saison ete = Saison.ETE;
		
		// System.out.println(ete.getNom());
		
		Saison hiver = Saison.find("hiver");
		
		System.out.println(hiver.getNumero());

	}

}
