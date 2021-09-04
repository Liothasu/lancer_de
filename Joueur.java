package exercice8;

public class Joueur {
   private String nom ;
   private int leScore ;
   
   public Joueur(String nom) {
	   
      this.nom = nom ;
      leScore = 0 ;
   }
   
   public int getScore() {
      return leScore ;
   }
   
   public void ajoute(int point)
   {
      leScore += point ;
   }
   public void affiche()
   {
      System.out.println(nom + " - " + leScore + " points");
   }  
}