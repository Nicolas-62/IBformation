package com.jpa.IBjavaJPA.pojo;

import javax.persistence.*;

@Entity
@Table(name="eleve")
public class Eleve {

	@Column(name="elv_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="elv_nom")
	private String nom;
	@Column(name="elv_prenom")
	private String prenom;
	@ManyToOne
	@JoinColumn(name = "elv_cls_k")
	private Classe classe;

	public Eleve() {
	};
	public Eleve(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Eleve(String nom, String prenom, Classe classe) {
		this.nom = nom;
		this.prenom = prenom;
		this.classe=classe;
	}

	public Classe getClasse() {
		return classe;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setClasse(Classe classe) {
		this.classe=classe;
	}
	
}