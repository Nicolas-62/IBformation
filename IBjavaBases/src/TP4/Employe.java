package TP4;

public abstract class Employe implements GestionnairePaie{
	
	protected String nom;
	protected String prenom;
	protected String categorie;
	protected String dateEmbauche;
	public static int nbEmploye=0;
	
	public Employe(String nom, String prenom, String dateEmbauche) throws EmployeConstructeurException{

		if(nom.length() == 0 || prenom.length() == 0 || dateEmbauche.length() == 0) {
			throw new EmployeConstructeurException(nbEmploye+1);
		}else {
			nbEmploye++;
			this.setNom(nom);
			this.setPrenom(prenom);
			this.setDateEmbauche(dateEmbauche);
		}

	}
	
	
	public String getNom() {
		return String.format("%s %s", this.categorie, this.nom);
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public String toString() {
		return String.format("categorie : %20s | nom : %20s | prenom : %20s | date embauche : %20s | salaire : %g |", 
				this.categorie, this.nom, this.prenom, this.dateEmbauche, this.calculerSalaire());
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	

}
