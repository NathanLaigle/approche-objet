package Listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		
		System.out.println(Arrays.toString(list.toArray()));
		
		int max = list.get(0);
		int min = list.get(0);
		int minIndex = 0;
		
		for(int number : list) {
			max = Math.max(max, number);
		}
		
		for(int i = 0; i < list.size(); i ++) {
			if(min > list.get(i)){
				min = list.get(i);
				minIndex = i;
			}
		}
		
		list.remove(minIndex);
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
		System.out.println("without min : " + Arrays.toString(list.toArray()));
		
		for(int i = 0;  i < list.size(); i ++) {
			list.set(i, Math.abs(list.get(i)));
		}

		System.out.println("without negatives : " + Arrays.toString(list.toArray()));
	}

}
