package exercice8;

public class NouvJoueur extends Joueur{
	
	private int nbEssai;
	
	public NouvJoueur(String nom) {
		
		super(nom);
		
	}
	
	public void ajoute(int point) {
		
		super.ajoute(point);
		nbEssai++;
	}
	
	public int getEssai() {
		return nbEssai;
	}
}