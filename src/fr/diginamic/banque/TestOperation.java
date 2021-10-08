package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] operationArray = {
				new Debit(10, 10),
				new Credit(20, 20),
				new Debit(100, 100),
				new Credit(200, 200),
		};
		
		int total = 0;
		
		for(int i = 0; i < operationArray.length; i++) {
			System.out.println("type : " + operationArray[i].getType());
			System.out.println("date : " + operationArray[i].getDate());
			System.out.println("mount : " + operationArray[i].getMount());
			System.out.println("-----");
			if(operationArray[i].getType() == "Credit") {
				total += operationArray[i].getMount();
			} else {
				total -= operationArray[i].getMount();
			}
		}
		
		System.out.println("\n#############");
		System.out.println("total : " + total);
		System.out.println("#############\n");

	}

}
