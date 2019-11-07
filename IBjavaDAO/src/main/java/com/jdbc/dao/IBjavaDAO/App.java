package com.jdbc.dao.IBjavaDAO;

import com.jdbc.dao.IBjavaDAO.dao.ClasseDAO;
import com.jdbc.dao.IBjavaDAO.dao.DAO;
import com.jdbc.dao.IBjavaDAO.dao.EleveDAO;
import com.jdbc.dao.IBjavaDAO.pojo.Classe;
import com.jdbc.dao.IBjavaDAO.pojo.Eleve;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Testons des élèves
		DAO<Eleve> eleveDao = new EleveDAO(MaConnexion.getConnection());
		// ajout d'un élève
		eleveDao.create(new Eleve("jacques", "dupond",1));
		// modificatio d'un élève
		Eleve modifyEleve = eleveDao.find(34);
		modifyEleve.setNom("dede");
		eleveDao.update(modifyEleve);
		// affichage
		for (int i = 1; i < 5; i++) {
			Eleve eleve = eleveDao.find(i);
			System.out.println("Elève N°" + eleve.getId() + "  - " + eleve.getNom() + " " + eleve.getPrenom() + " " + eleve.getClasse_id());
		}

		
		System.out.println("\n********************************\n");

		// affichae classe d'id 11 et de ses élèves
		DAO<Classe> classeDao = new ClasseDAO(MaConnexion.getConnection());
		Classe classe = classeDao.find(11);
		
		System.out.println("Classe de " + classe.getNom());
	    System.out.println("\nListe des élèves :");
	    for(Eleve eleve : classe.getListEleve())
	      System.out.println("  - " + eleve.getNom() + " " + eleve.getPrenom());
	      
		
		System.out.println("\n********************************\n");
		
		

	}
}
