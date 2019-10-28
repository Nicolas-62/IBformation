package TP1;

import java.util.Scanner;

public class Premier {
    public static boolean estPremier(int nb){
        boolean flag = true;
        for (int i = 2; i <= (nb / 2); i++) {
            if (nb % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        char rep = 'o';

        while(rep=='o') {
            System.out.println("Veuillez saisir une nombre : ");
            int nb = sc.nextInt();
            if (estPremier(nb)) {
                System.out.println("ce n'est pas un nombre premier");
            } else {
                System.out.println("c'est un nombre premier");
            }
        System.out.println("voulez vous continuer ? si oui tapez 'o' sinon une autre touche");
        rep = sc.nextLine().charAt(0);

        }
        System.out.println("Fermeture du programme");

    }

}
