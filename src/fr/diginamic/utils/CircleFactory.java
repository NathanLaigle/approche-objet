package fr.diginamic.utils;

import fr.diginamic.shape.Circle;

public class CircleFactory {
	public static Circle create(double radius) {
		return new Circle(radius);
	}
}
