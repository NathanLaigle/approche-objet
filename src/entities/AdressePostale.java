package entities;

public class AdressePostale {
	public static void main(String[] args) {
		
	}
	
	public AdressePostale(int streetNumber, String streetName, int postCode, String cityName){
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.postCode = postCode;
		this.cityName = cityName;
	}
	
	public int streetNumber;
	public String streetName;
	public int postCode;
	public String cityName;
}
