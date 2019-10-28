package TP3;

public class Manuel extends Oeuvre{
	public static int nbManuel=0;
	
	public Manuel(String titre, String auteur, String genre) {
		super(titre, auteur);
		this.genre = "manuel";
		nbManuel++;
	}

}
