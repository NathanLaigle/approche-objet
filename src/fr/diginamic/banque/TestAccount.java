package fr.diginamic.banque;

import fr.diginamic.banque.entites.Account;
import fr.diginamic.banque.entites.AccountRate;

public class TestAccount {
	public static void main(String[] args) {
		Account[] accountArray = {
				new Account(1, 100),
				new AccountRate(1, 100, 0.2F)
		};
		
		for(int i = 0; i < accountArray.length; i ++) {
			System.out.println(accountArray[i].toString());
		}
	}
}
