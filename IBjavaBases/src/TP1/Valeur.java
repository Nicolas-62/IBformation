package TP1;

import java.util.Scanner;

public class Valeur {
    public static void main(String[] args){
        int rep = 0;
        Scanner sc = new Scanner(System.in);
        int nbSaisi;
        int max;
        int min;
        int total;
        int nbEntrees;
        float moy;

        System.out.println("Veuillez saisir un nombre, saisissez 0 quand vous voulez arrrêter");
        nbSaisi = sc.nextInt();
        sc.nextLine();

        if(nbSaisi!=0) {
            min = nbSaisi;
            max = nbSaisi;
            total = nbSaisi;
            nbEntrees = 1;

            while (nbSaisi != 0) {
                System.out.println("Veuillez saisir un autre nombre");
                nbSaisi = sc.nextInt();
                sc.nextLine();

                if (nbSaisi != 0) {
                    total += nbSaisi;
                    nbEntrees++;
                    if(nbSaisi < min){
                        min = nbSaisi;
                    }
                    min = (nbSaisi < min) ? nbSaisi : min;
                    max = (nbSaisi > max) ? nbSaisi : max;
                }
            }
            moy = total / nbEntrees;
            System.out.println("Resultats : ");
            System.out.println("max : " + max);
            System.out.println("min : " + min);
            System.out.println("moyenne : " + moy);
        }else{
            System.out.println("vous n'avez entré aucun chiffre");
        }
    }
}
