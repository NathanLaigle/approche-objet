package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	Piece[] pieces = new Piece[0];
	
	public void ajouterPiece(Piece piece) {
		if(piece == null) {
			System.out.println("La piece ne peut pas etre null");
			return;
		}
		this.pieces = Arrays.copyOf(this.pieces, this.pieces.length + 1);
		this.pieces[this.pieces.length - 1] = piece;	
	}
	
	public double getSuperficieTotale() {
		double total = 0;
		for(int i = 0; i < this.pieces.length; i ++) {
			total += this.pieces[i].getSuperficie();
		}
		return total;
	}
	
	public double getSuperficieEtage(int etage) {
		double total = 0;
		for(int i = 0; i < this.pieces.length; i ++) {
			if(this.pieces[i].getEtage() == etage) {
				total += this.pieces[i].getSuperficie();				
			}
		}
		return total;
	}
	
	public double getSuperficiePieces(String typePiece) {
		double total = 0;
		for(int i = 0; i < this.pieces.length; i ++) {
			if(this.pieces[i].getClass().getSimpleName().equals(typePiece)) {
				total += this.pieces[i].getSuperficie();				
			}
		}
		return total;
	}
	
	public int getNombreDePiece(String typePiece) {
		if(typePiece == null) {
			return this.pieces.length;
		}
		int total = 0;
		for(int i = 0; i < this.pieces.length; i ++) {
			if(this.pieces[i].getClass().getSimpleName().equals(typePiece)) {
				total ++;				
			}
		}
		return total;
	}
}
