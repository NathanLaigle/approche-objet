package Listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		// Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes
		list.add("Nice");
		list.add("Carcassonne");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");
		
		String maxLengthCity = list.get(0);
		
		for (String city : list) {
			maxLengthCity = maxLengthCity.length() < city.length() ? city : maxLengthCity;
		}
		
		System.out.println("maxLengthCity : " + maxLengthCity);
	
		for(int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
		
		System.out.println("With capital letters :" + Arrays.toString(list.toArray()));
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String city = iterator.next();
			if(city.charAt(0) == 'N') {
				iterator.remove();
			}
		}
		
		System.out.println("Without N-starting cities :" + Arrays.toString(list.toArray()));
		
	}
}
