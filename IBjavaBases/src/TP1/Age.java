package TP1;

import java.util.Scanner;

public class Age {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char rep = 'o';

        while(rep == 'o') {

            System.out.println("entrez votre age : ");
            int age = sc.nextInt();
            sc.nextLine();

            if (age > 60) {
                System.out.println("tu es  sénior");
            } else if (age > 18) {
                System.out.println("tu es à la adulte");
            } else if (age > 13) {
                System.out.println("tu es adolescent");
            } else if (age > 2) {
                System.out.println("tu es un enfant");
            } else if (age >= 0) {
                System.out.println("tu es un bébé");
            } else {
                System.out.println("tu t'es trompé");
            }
            System.out.println("voulez vous continuer ? si oui tapez 'o' sinon une autre touche");
            rep = sc.nextLine().charAt(0);
        }
        System.out.println("Fermeture du programme");
    }
}
