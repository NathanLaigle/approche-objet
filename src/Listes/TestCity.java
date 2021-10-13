package Listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestCity {

	public static void main(String[] args) {
		List<City> cities = new ArrayList<City>();

		cities.add(new City("Nice", 343_000));
		cities.add(new City("Carcassonne", 47_800));
		cities.add(new City("Narbonne", 53_400));
		cities.add(new City("Lyon", 484_000));
		cities.add(new City("Foix", 9_700));
		cities.add(new City("Pau", 77_200));
		cities.add(new City("Marseille", 850_700));
		cities.add(new City("Tarbes", 40_600));

		City mostPopulatedCity = cities.get(0);

		for (City city : cities) {
			mostPopulatedCity = mostPopulatedCity.getInhabitants() < city.getInhabitants() ? city : mostPopulatedCity;
		}

		System.out.println("Most populated city : " + mostPopulatedCity.getName());

		int leastPopulatedCityIndex = 0;

		for (int i = 0; i < cities.size(); i++) {
			leastPopulatedCityIndex = cities.get(leastPopulatedCityIndex).getInhabitants() > cities.get(i).getInhabitants() ? i
					: leastPopulatedCityIndex;
			if (cities.get(i).getInhabitants() > 100_100) {
				cities.get(i).setName(cities.get(i).getName().toUpperCase());
			}
		}

		cities.remove(leastPopulatedCityIndex);

		System.out.println("Without lest populated city & with cities that are over 100_000 inhabitants capitalized: ");
		
		for(City city : cities) {
			System.out.println(city.getName());
		}

	}

}
