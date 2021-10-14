package sets;

public class Country implements Comparable<Country> {

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
	
	/*
	public int compareTo(Country o) {
		return this.name.compareTo(o.name);
	}
	*/
	
	public int compareTo(Country o) {
		return o.getInhabitants() - this.inhabitants ;
	}

	private String name;
	private int inhabitants;
	private double GDP;

}
