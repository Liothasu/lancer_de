package exercice8;

public class TestJoueur {

	public static void main(String[] args) {
		
		De de = new De();
		NouvJoueur lise = new NouvJoueur("Lise");
		NouvJoueur hugo = new NouvJoueur("Hugo");
		
		
		while(lise.getEssai() < 10) {
			
			System.out.println("Tour n° "+ (lise.getEssai()+1));
			
			lise.ajoute(de.jeterDe());
			lise.affiche();
			hugo.ajoute(de.jeterDe());
			hugo.affiche();
		}
		
		if(lise.getScore() > hugo.getScore()) {
			System.out.println("Lise a gagné une PS4 !");
		}
		else if(lise.getScore() < hugo.getScore()) {
			System.out.println("Hugo a gagné une PS4 !");
		}
		else {
			System.out.println("Personne ne gagnera la PS4");
		}
	}
}