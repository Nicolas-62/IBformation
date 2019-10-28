package TP3;

public class Bd extends Oeuvre{
	protected boolean isColored;
	public static int nbBd=0;
	
	public Bd(String titre, String auteur, boolean isColored) {
		super(titre, auteur);
		this.genre = "bd";
		this.isColored = isColored;
		nbBd++;
	}
	@Override
	public String toString() {
		return super.toString()+String.format("est en couleur :\t %s", this.isColored);
	}
}
