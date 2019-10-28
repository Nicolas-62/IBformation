package TP3;

public class TP3Test {
	
	public static void main(String[] args) {
		
		Oeuvre[] tabOeuvre = new Oeuvre[50];
		
		Roman unRoman = new Roman("Dune", "Franck Herbert", "poche");
		tabOeuvre[0] = unRoman;
		
		Bd uneBd = new Bd("Gaston Lagaffe", "Franquin", true);
		tabOeuvre[1] = uneBd;
		
		LivreCuisine unLivreCuisine = new LivreCuisine("le Canard", "Jean Pierre Coffe", true);
		tabOeuvre[2] = unLivreCuisine;
		
		Roman unRoman2 = new Roman("Blade Runner", "Philip K. Dick", "poche");
		tabOeuvre[3] = unRoman2;
		
		
		
		for(Oeuvre oeuvre : tabOeuvre) {
			if(oeuvre != null)
			System.out.println(oeuvre);
		}
		for(int i=0; i<tabOeuvre.length; i++) {
			if(tabOeuvre[i] != null)
			System.out.println(tabOeuvre[i]);
		}
		System.out.println("statistiques : ");
		System.out.println("oeuvres : " + Oeuvre.nbOeuvre);
		System.out.println("romans : " + Roman.nbRoman);
		System.out.println("livres de cuisine : " + LivreCuisine.nbLivreCuisine);
		System.out.println("Bds : " + Bd.nbBd);
		
	}

}
