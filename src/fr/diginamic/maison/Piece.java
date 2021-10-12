package fr.diginamic.maison;

public abstract class Piece {
	public Piece(double superficie, int etage) {
		if(superficie <= 0) {
			superficie = Math.abs(superficie);
		}
		if(etage < 0) {
			etage = 0;
		}
		this.superficie = superficie;
		this.etage = etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	private double superficie;
	private int etage;
}
