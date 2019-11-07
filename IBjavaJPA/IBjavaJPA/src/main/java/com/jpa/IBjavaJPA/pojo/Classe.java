package com.jpa.IBjavaJPA.pojo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="classe")
public class Classe {
	
	@Column(name="cls_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id = 0;
	
	@Column(name="cls_nom")
	private String nom = "";
	
	@OneToMany(mappedBy="classe", cascade = CascadeType.ALL)
	private Set<Eleve> eleves;

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


	public Set<Eleve> getEleves() {
		return eleves;
	}


}
