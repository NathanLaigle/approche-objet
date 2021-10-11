package fr.diginamic.operations;

public class CalculMoyenne {
	
	/**
	 * Resize and add a double to this.array
	 */
	public void addNumber(double d) {
		this.resizeArray();
		this.array[this.array.length - 1] = d;
	}
	
	/**
	 * Return the average of all doubles in this.array
	 * @return double
	 */
	public double getAverage() {
		double total = 0;
		for(int i = 0; i < this.array.length; i ++) {
			total += this.array[i];
		}
		return total / this.array.length;
	}

	/**
	 * Add an empty cell to this.array
	 */
	private void resizeArray() {
		double[] resized = new double[this.array.length + 1];
		for (int i = 0; i < this.array.length; i ++) {
			resized[i] = this.array[i];
		}
		this.array = resized;
	}
	
	/**
	 * this.array getter
	 * @return double[]
	 */
	public double[] getArray() {
		return array;
	}

	private double[] array = new double[0];
}
