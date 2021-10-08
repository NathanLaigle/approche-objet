package entities2;

import entities.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne gugus = new Personne("PrenomSwag", "NomSwag",
				new AdressePostale(1, "rue du swag", 34070, "SwagVille"));
		Personne gugus2 = new Personne("PrenomSwag2", "NomSwag2",
				new AdressePostale(2, "rue du swag", 34070, "SwagVille"));
		
		gugus.setAddress(new AdressePostale(4, "rue du swag", 34070, "SwagVille"));
		gugus.setFirstName("The swaggy gugus");
	}

}
