package exercice8;

import java.util.Random;

public class De {
	
	private int nbFaces;
	
	public De() {
		
		nbFaces = 6;
	}
	
	public De(int nbFaces) {
		this.nbFaces = nbFaces;
	}

	public int getNbFaces() {
		return nbFaces;
	}
	
	public int jeterDe() {
		
		Random hasard = new Random();
		return hasard.nextInt(nbFaces)+1;
	}
}