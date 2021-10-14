package tri;

import java.util.Comparator;

import sets.Country;

public class ComparatorInhabitant implements Comparator<Country>{

	public int compare(Country o1, Country o2) {
		return o2.getInhabitants() - o1.getInhabitants();
	}
}
