package tri;

import java.util.Comparator;

import sets.Country;

public class ComparatorNom implements Comparator<Country>{
	public int compare(Country o1, Country o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
