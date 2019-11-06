package com.nico.IBjavaBdd;

public class Classe {
//ID
	private int id = 0;
//Nom du professeur
	private String nom = "";


	public Classe(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public Classe() {
	}

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

	public boolean equals(Classe cls) {
		return this.getId() == cls.getId();
	}
}
