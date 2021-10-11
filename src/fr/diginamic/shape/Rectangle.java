package fr.diginamic.shape;

public class Rectangle extends Shape {

	public Rectangle(double length, double height) {
		this.height = height;
		this.length = length;
	}

	public double perimeter() {
		return 2 * this.length + 2 * this.height;
	}

	public double surface() {
		return this.height * this.length;
	}

	public double length;

	public double height;

}
