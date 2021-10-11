package fr.diginamic.essais;

import fr.diginamic.salaire.Employee;
import fr.diginamic.salaire.Freelancer;
import fr.diginamic.salaire.Intervenant;

public class TestIntervenant {

	public static void main(String[] args) {
		Intervenant i1 = new Employee("Dumas", "Jean", 1732.12);
		Intervenant i2 = new Freelancer("Dumas", "Jean", 231.33, 5);
		
		i1.getInfo();
		i2.getInfo();

	}

}
