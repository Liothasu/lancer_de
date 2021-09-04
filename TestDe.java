package exercice8;

public class TestDe {

	public static void main(String[] args) {
		
		De donia = new De(8);
		
		int nbJet[] = new int [donia.getNbFaces()];
		
		for(int i = 0; i < 1000; i++) {
			
			switch(donia.jeterDe()) {
			
			case 1 : System.out.println("1"); nbJet[0]++; break;
			case 2 : System.out.println("2"); nbJet[1]++; break;
			case 3 : System.out.println("3"); nbJet[2]++; break;
			case 4 : System.out.println("4"); nbJet[3]++; break;
			case 5 : System.out.println("5"); nbJet[4]++; break;
			case 6 : System.out.println("6"); nbJet[5]++; break;
			case 7 : System.out.println("7"); nbJet[6]++; break;
			case 8 : System.out.println("8"); nbJet[7]++; break;
			}
		}	
		for(int j = 0; j < nbJet.length; j++) {
			
			System.out.println((j + 1)+ " : "+nbJet[j]);
		}
	}
}
