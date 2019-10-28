package TP3;

public abstract class Oeuvre {
	protected String titre;
	protected String auteur;
	protected String genre;
	public static int nbOeuvre=0;
	
	public Oeuvre(String titre, String auteur) {
		this.titre = titre;
		this.auteur = auteur;
		nbOeuvre++;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return String.format("genre : %20s | titre : %20s | auteur : %20s | ", this.genre, this.titre, this.auteur);
	}


}
