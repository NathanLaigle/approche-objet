package fr.diginamic.shape;

public class Circle implements ObjetGeometrique{
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public double surface() {
		return Math.PI * this.radius * this.radius;
	}

	private double radius;
}
