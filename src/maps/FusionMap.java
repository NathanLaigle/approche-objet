package maps;

import java.util.HashMap;
import java.util.Set;

public class FusionMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		Set<Integer> map1Keys = map1.keySet();
		Set<Integer> map2Keys = map2.keySet();
		
		for(Integer i : map1Keys) {
			map3.put(i, map1.get(i));
		}
		
		for(Integer i : map2Keys) {
			map3.put(i, map2.get(i));
		}
		
		System.out.println(map3.toString());

	}

}
