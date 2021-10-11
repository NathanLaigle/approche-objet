package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestCalcAverage {

	public static void main(String[] args) {
		CalculMoyenne testClass = new CalculMoyenne();
		testClass.addNumber(4);
		testClass.addNumber(6);
		testClass.addNumber(8);
		
		System.out.println(testClass.getAverage());
		
		CalculMoyenne testClass2 = new CalculMoyenne();
		testClass2.addNumber(-4);
		testClass2.addNumber(600.98);
		testClass2.addNumber(809);
		testClass2.addNumber(0);
		testClass2.addNumber(0);
		
		System.out.println(testClass2.getAverage());		

	}

}
