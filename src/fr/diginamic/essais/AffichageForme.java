package fr.diginamic.essais;

import fr.diginamic.shape.Shape;

public class AffichageForme {
	
	public static void logShape(Shape shape) {
		System.out.println("surface :  " + shape.surface() + "\nperimeter : " + shape.perimeter());
	}
	
}
