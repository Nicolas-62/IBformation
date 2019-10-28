package TP3;

public class LivreCuisine extends Oeuvre{
	protected boolean isIllustre;
	public static int nbLivreCuisine=0;
	
	public LivreCuisine(String titre, String auteur, boolean isIllustre) {
		super(titre, auteur);
		this.genre = "livreCuisine";
		this.isIllustre = isIllustre;
		nbLivreCuisine++;
	}
	@Override
	public String toString() {
		return super.toString()+String.format("est illustré :\t %s", this.isIllustre);
	}	
}
