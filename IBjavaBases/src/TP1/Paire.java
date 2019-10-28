package TP1;

import java.util.Scanner;

public class Paire {

    public static boolean estPaire(int nb){
        boolean flag = false;
        if(nb%2==0)
            flag=true;
        return flag;
    }
    public static void afficher(int nb){
        System.out.println();
        for(int i=1; i<=nb; i++){

            System.out.println(i);
            if(estPaire(i)){
                System.out.println("le nombre "+i+" est Paire");
            }else{
                System.out.println("les nombre "+i+" n'est pas paire");
            }
        }
    }
    public static int demanderNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre un nombre : ");
        int nb = sc.nextInt();
        return nb;
    }

    public static void main(String[] args){
        int nombre = demanderNombre();
        afficher(nombre);
        String.valueOf(1);

    }
}
