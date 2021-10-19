package Listes;

public enum Continent {
	EUROPE("Europe"),
	AFRIQUE("Afrique"),
	ASIE("Asie"),
	OCEANIE("Océanie");
	
	
	private String nom;
	
	private Continent(String nom) {
		this.nom = nom;
	}
}
