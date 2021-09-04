package exercice8;

public class TestJoueur2 {

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
			System.out.println();
			
			if(lise.getScore() >= 21 && lise.getScore() > hugo.getScore()) {
				System.out.println("Lise a gagné une PS4 !");
				break;
			}
			else if(hugo.getScore() >= 21 && hugo.getScore() > lise.getScore()) {
				System.out.println("Hugo a gagné une PS4 !");
				break;
			}
		}
	}
}