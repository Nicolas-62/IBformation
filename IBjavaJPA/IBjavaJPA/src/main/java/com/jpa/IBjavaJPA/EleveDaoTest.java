package com.jpa.IBjavaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.IBjavaJPA.pojo.Classe;
import com.jpa.IBjavaJPA.pojo.Eleve;

public class EleveDaoTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Ecole");
		EntityManager entityManager = factory.createEntityManager();
		System.out.println("*******************************************");
		System.out.println("créer un élève...");
		entityManager.getTransaction().begin();
		Eleve e = new Eleve();
		e.setNom("balavoine");
		e.setPrenom("daniel");
		e.setClasse(entityManager.find(Classe.class, 1));
		entityManager.persist(e);
		entityManager.getTransaction().commit();
		
		System.out.println("*******************************************");
		System.out.println("récupérer et afficher premier élève :");
		// récupérer et afficher premier élève :
		Integer primaryKey = 1;
		Eleve eleve = entityManager.find(Eleve.class, primaryKey);	 
		System.out.println(eleve.getId());
		System.out.println(eleve.getNom());
		System.out.println(eleve.getPrenom());
		System.out.println(eleve.getClasse().getNom());
		
		System.out.println("update premier élève...");
		// mettre à jour une ligne UPDATE :
		Eleve exEleve = new Eleve();
		exEleve.setId(1);
		exEleve.setNom("Madelin");
		exEleve.setPrenom("Alain");		
		exEleve.setClasse(entityManager.find(Classe.class, 1));
		entityManager.getTransaction().begin();
		entityManager.merge(exEleve);
		entityManager.getTransaction().commit();
		
		System.out.println("*******************************************");
		System.out.println("récupérer et afficher premier élève :");
		// récupérer et afficher premier élève :
		eleve = entityManager.find(Eleve.class, primaryKey);	 
		System.out.println(eleve.getId());
		System.out.println(eleve.getNom());
		System.out.println(eleve.getPrenom());
		System.out.println(eleve.getClasse().getNom());
		
		System.out.println("*******************************************");
		System.out.println("réaliser une requète SQL : (dernier élève créé)");
		// réaliser une requète SQL :
		String sql = "SELECT e FROM Eleve e where e.nom = 'coquille'";
		Query query = entityManager.createQuery(sql);
		Eleve lastEleve = (Eleve) query.getSingleResult();
		System.out.println("élève  : "); 
		System.out.println(lastEleve.getId());
		System.out.println(lastEleve.getNom());
		System.out.println(lastEleve.getPrenom());
		System.out.println(lastEleve.getClasse().getNom());

		entityManager.close();
		factory.close();
		

	}

}
