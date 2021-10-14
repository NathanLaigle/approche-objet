package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<Integer, String>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		// -----------------------------
		
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(30, "Bordeaux");
		

		Set<Integer> mapKeySet = mapVilles.keySet();
		
		for(Integer cp : mapKeySet) {
			System.out.println(cp);
		}
		
		Collection<String> mapValue = mapVilles.values();
		
		for(String c: mapValue) {
			System.out.println(c);
		}
	}

}
