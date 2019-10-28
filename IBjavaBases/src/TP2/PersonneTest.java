package TP2;

import java.util.Scanner;

public class PersonneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean redo =true;
		System.out.println("Bienvenue dans l'espace d'ajout de personnes");
		Scanner sc = new Scanner(System.in);
		String nom;
		String prenom;
		String email;
		Personne[] tabPersonne = new Personne[10];
		char choix;
		
		while(redo) {
			System.out.println("-----------------------------------");
			System.out.println("|\t MENU \t|");
			System.out.format("| %40s | \n", new String("Ajouter une personn : p"));
			System.out.println("|\t Liste des personne : l \t|");
			System.out.println("|\t Quitter : q \t|");
			System.out.println("-----------------------------------");
			choix = sc.nextLine().charAt(0);

			
			switch (choix) {
			
			case 'p' :
				if(Personne.nbInstances < 10) {
					System.out.println("Ajouter une personne : ");
					System.out.println("nom ? : ");
					nom = sc.nextLine();
					System.out.println("prénom ? : ");
					prenom = sc.nextLine();
					Personne unePersonne = new Personne(nom, prenom);
					tabPersonne[Personne.nbInstances-1] = unePersonne;
				}else {
					System.out.println("nombre max de personnes atteint");
				}
				break;
			case 'l' :
				if(Personne.nbInstances > 0) {
					for(int i = 0; i<Personne.nbInstances; i++) {
						System.out.println("Personne n°"+i+1+" : ");
						System.out.println("nom : "+tabPersonne[i].getNom());
						System.out.println("prenom : "+tabPersonne[i].getPrenom());
						System.out.println("email : "+tabPersonne[i].getEmail());
					}					
				}else {
					System.out.println("Pas de personnes dans la liste");
				}
				break;
			case 'q' :
				redo = false;
				break;
				
			default :
				redo = false;
				break;
			} 
		}
		System.out.println("fermeture du programme");
	}

}
