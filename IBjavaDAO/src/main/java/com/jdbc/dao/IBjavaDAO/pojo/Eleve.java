package com.jdbc.dao.IBjavaDAO.pojo;

public class Eleve {
	// ID
	private int id = 0;
	// Nom de l'élève
	private String nom = "";
	// Prénom de l'élève
	private String prenom = "";
	
	private int classe_id=0;

	public Eleve(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Eleve(String nom, String prenom, int classe_id) {
		this.nom = nom;
		this.prenom = prenom;
		this.classe_id=classe_id;
	}
	public Eleve(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Eleve() {
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
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
	public int getClasse_id() {
		return classe_id;
	}
	public void setClasse_id(int classe_id) {
		this.classe_id = classe_id;
	}
}