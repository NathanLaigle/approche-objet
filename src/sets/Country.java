package sets;

public class Country {

	public Country(String name, int inhabitants, double GPD) {
		this.name = name;
		this.inhabitants = inhabitants;
		this.GDP = GPD;
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

	public double getGDP() {
		return GDP;
	}

	public void setGDP(double gDP) {
		GDP = gDP;
	}
	
	public double getGDPByInhabitants() {
		return this.GDP / this.inhabitants;
	}

	private String name;
	private int inhabitants;
	private double GDP;

}
