package fr.diginamic.operations;

public class Operations {
	public static double calcul(double d1, double d2, char operator) {
		switch (operator) {
		case '-':
			return d1 - d2;
		case '+' :
			return d1 + d2;
		case '/' :
			return d1 / d2;
		case '*' :
			return d1 * d2;
		case '%' :
			return d1 % d2;
		default : 
			throw new IllegalArgumentException("Can't calcul with operator" + operator);

		}
	}
}
