package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {
		List<City> cities = CityInitializer.getCities();
		
//		Show MTP
//		for(City c : cities) {
//			if(c.getMunicipalityName().equals("Montpellier")) {
//				System.out.println(c.toString());
//			}
//		}
	
		
		// herault population
		int heraultInhabitant = 0;
		List<City> heraultCities = new ArrayList<City>();
		
		for(City c : cities) {
			if(c.getDepartmentCode().equals("34")) {
				heraultCities.add(c);
				heraultInhabitant += c.getInhabitant();
			}
		}
		// System.out.println(heraultInhabitant);
		
		// System.out.println(Collections.min(heraultCities, Comparator.comparing(City::getInhabitant)));
		
		Collections.sort(heraultCities, new Comparator<City>() {
			public int compare(City c1, City c2) {
				return c1.getInhabitant() - c2.getInhabitant();
			}
		});

		for(int i = 0; i < 10; i++) {
			// System.out.println(heraultCities.get(i).toString());
		}
		
		for(int i = heraultCities.size() - 1; i > heraultCities.size() - 11; i--) {
			// System.out.println(heraultCities.get(i).toString());
		}
		
		// --------------------------
		// same thing with occitanie :
		// --------------------------
		
		int oInhabitant = 0;
		List<City> oCities = new ArrayList<City>();
		
		for(City c : cities) {
			if(c.getRegionCode() ==  76) {
				oCities.add(c);
				oInhabitant += c.getInhabitant();
			}
		}
		
		// System.out.println(oInhabitant);
		
		Collections.sort(oCities, new Comparator<City>() {
			public int compare(City c1, City c2) {
				return c1.getInhabitant() - c2.getInhabitant();
			}
		});
		
		for(int i = 0; i < 10; i++) {
			// System.out.println(oCities.get(i).toString());
		}
		
		for(int i = oCities.size() - 1; i > oCities.size() - 11; i--) {
			// System.out.println(oCities.get(i).toString());
		}
		
		// --------------------------
		// same thing with France :
		// --------------------------
		
		// ...
	}

}
