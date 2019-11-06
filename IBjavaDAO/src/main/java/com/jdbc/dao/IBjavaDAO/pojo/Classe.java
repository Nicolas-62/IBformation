package com.jdbc.dao.IBjavaDAO.pojo;

import java.util.HashSet;
import java.util.Set;

public class Classe {
//ID
	private int id = 0;
//Nom du professeur
	private String nom = "";
	private Set<Eleve> listEleve = new HashSet<Eleve>();

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

	public Set<Eleve> getListEleve() {
		return listEleve;
	}

	public void setListEleve(Set<Eleve> listEleve) {
		this.listEleve = listEleve;
	}
	public void addEleve(Eleve e) {
		this.listEleve.add(e);
	}
}
