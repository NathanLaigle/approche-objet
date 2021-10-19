package Listes;

public class City {

	public City(String name, int inhabitants, Continent continent) {
		this.name = name;
		this.inhabitants = inhabitants;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", inhabitants=" + inhabitants + ", continent=" + continent + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInhabitants() {
		return inhabitants;
	}

	public void setInhabitants(int inhabitants) {
		this.inhabitants = inhabitants;
	}
	

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}



	private String name;
	private int inhabitants;
	private Continent continent;
}
