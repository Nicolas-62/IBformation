package TP1;

import java.util.Scanner;

public class StagiaireTest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nom;
        String prenom;
        int age;
        char rep = 'o';
        
        while(rep == 'o') {
        	System.out.println("création d'un stagiaire : ");
            System.out.println("Nom ?");
            nom = sc.nextLine();
            System.out.println("Prénom ?");
            prenom = sc.nextLine();
            System.out.println("Age ?");
            age = sc.nextInt();
            sc.nextLine();
            Stagiaire unStagiaire = new Stagiaire(nom, prenom, age);
            System.out.println("nom du stagiaire : " + unStagiaire.getNom());
            System.out.println("voulez vous recréer un stagiaire ? si oui tapez 'o' sinon une autre touche");
            rep = sc.nextLine().charAt(0);
            
        }      
        System.out.println("nombre de stagiaires instanciés : "+Stagiaire.afficherInstances());
    }

}
