package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetsDouble {
	public static void main(String[] args) {
		Set<Double> hs = new HashSet<Double>();
		Collections.addAll(hs, 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);
		
		for(Double d : hs) {
			System.out.println(d);
		}
		
		System.out.println("----");
		
		System.out.println(Collections.max(hs));
		
		System.out.println("----");
		
		hs.remove(Collections.min(hs));
		
		for(Double d : hs) {
			System.out.println(d);
		}
		
	}
}
