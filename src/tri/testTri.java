package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sets.Country;

public class testTri {

	public static void main(String[] args) {
		List<Country> list = new ArrayList<Country>();
		Collections.addAll(list, new Country("Usa", 12, 12), new Country("France", 10, 10));
		Collections.sort(list);
		System.out.println("Sorted list :");
		for (Country c : list) {
			System.out.println(c.getName());
		}
		

	}

}
