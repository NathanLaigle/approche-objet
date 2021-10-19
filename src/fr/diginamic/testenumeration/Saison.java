package fr.diginamic.testenumeration;

public enum Saison {
	
	HIVER("hiver", 0),
	PRINTEMPS("printemps", 1),
	ETE("ete", 2),
	AUTOMNE("automne", 3);
	
	public static Saison find(String nom) {
		for(Saison s : Saison.values()) {
			if (s.getNom().equals(nom)) {
				return s;
			}
		}
		return null;
	}
	
	
	private String nom;
	private int numero;
	
	Saison(String nom, int numero) {
		this.nom = nom;
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
