package TP2;

public class Personne {
	private String nom;
	private String prenom;
	private String email;
	public static int nbInstances=0;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = nom+"."+prenom+"@example.com";
		nbInstances++;
		
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return this.nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
