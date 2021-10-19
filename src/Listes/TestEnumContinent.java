package Listes;

import java.util.ArrayList;
import java.util.List;

public class TestEnumContinent {

	public static void main(String[] args) {
		List<City> cities = new ArrayList<City>();
		cities.add(new City("Nice", 343_000, Continent.EUROPE));
		cities.add(new City("Carcassonne", 47_800, Continent.EUROPE));
		cities.add(new City("Narbonne", 53_400, Continent.EUROPE));
		cities.add(new City("Lyon", 484_000, Continent.EUROPE));
		cities.add(new City("Foix", 9_700, Continent.EUROPE));
		cities.add(new City("Pau", 77_200, Continent.EUROPE));
		cities.add(new City("Marseille", 850_700, Continent.EUROPE));
		cities.add(new City("Tarbes", 40_600, Continent.EUROPE));
		
		for(City c : cities) {
			System.out.println(c.toString());
		}

	}

}
