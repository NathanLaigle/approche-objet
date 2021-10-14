package sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestCountry {

	public static void main(String[] args) {
		Set<Country> countries = new HashSet<Country>();
		Collections.addAll(countries, new Country("Usa", 13, 1334.98), new Country("France", 5, 133.98));
		
		Country maxGDPByInhabitants = countries.iterator().next();
		Country maxGDP = countries.iterator().next();
		Country minGDP = countries.iterator().next();
		
		
		for(Country c : countries) {
			maxGDPByInhabitants = c.getGDPByInhabitants() > maxGDPByInhabitants.getGDPByInhabitants() ? c : maxGDPByInhabitants;
			maxGDP = c.getGDP() > maxGDP.getGDP() ? c : maxGDP;
			minGDP = c.getGDP() < minGDP.getGDP() ? c : minGDP;
		}
		
		System.out.println("Best GPD : " + maxGDPByInhabitants.getName());
		System.out.println("Max GPD : " + maxGDP.getName());

		countries.remove(minGDP);	
		minGDP.setName(minGDP.getName().toUpperCase());		
		countries.add(minGDP);
		
		System.out.println("Min in uppercase : ");
		for(Country c : countries) {
			System.out.println(c.getName());
		}
		
		System.out.println("without min gdp : ");
		
		countries.remove(minGDP);
		
		for(Country c : countries) {
			System.out.println(c.getName());
		}
		
		System.out.println("total : ");
		for(Country c : countries) {
			System.out.println(c.getName() + " - " + c.getInhabitants() + " - " + c.getGDP());
		}
		
		
	}

}
