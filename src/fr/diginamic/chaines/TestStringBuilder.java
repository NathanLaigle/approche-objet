package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder string = new StringBuilder();
		
		long start = System.currentTimeMillis();
		
		for(int i = 1; i <= 100_000; i ++) {
			string.append(i);
		}

		long end = System.currentTimeMillis();
		
		System.out.println("StringBuilder :" + (end - start));
		
		String string2 = "";
		
		long start2 = System.currentTimeMillis();
		
		for(Integer i = 1; i <= 100_000; i ++) {
			string2 += i.toString();
		}
		
		long end2 = System.currentTimeMillis();
		
		System.out.println("StringBuilder :" + (end2 - start2));
	}

}
