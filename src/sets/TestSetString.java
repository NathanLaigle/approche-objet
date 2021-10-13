package sets;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		Collections.addAll(hs, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");
		
		String longest = Collections.max(hs, Comparator.comparing(String::length));
		
		System.out.println("Longest string : " + longest);
		
		hs.remove(longest);
		
		for(String country : hs) {
			System.out.println(country);
		}
		
	}
}
