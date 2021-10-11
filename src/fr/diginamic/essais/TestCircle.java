package fr.diginamic.essais;

import fr.diginamic.shape.Circle;
import fr.diginamic.utils.CircleFactory;

public class TestCircle {

	public static void main(String[] args) {
		Circle[] circleArray = {
				CircleFactory.create(2),
				CircleFactory.create(4),
		};
		
		for(int i = 0 ; i < circleArray.length; i ++) {
			System.out.println("surface :  " + circleArray[i].surface() + "\nperimeter : " + circleArray[i].perimeter());
		}

	}

}
