package fr.diginamic.shape;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] objectArray = {
				new Circle(2),
				new Rectangle(2, 4)
		};
		
		for (int i = 0; i < objectArray.length; i++) {
			System.out.println("surface :  " + objectArray[i].surface() + "\nperimeter : " + objectArray[i].perimeter());
		}

	}

}
