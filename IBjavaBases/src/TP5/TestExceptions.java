package TP5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Veuillez saisir un entier : ");
			try {
				int entier = sc.nextInt();
				int i = 10; i = i / entier;
			}catch(InputMismatchException e) {
				System.out.println("Vous n'avez pas saisi un entier");
				e.printStackTrace();
			}catch(ArithmeticException e) {
				System.out.println("veuillez saisir un nombre different de zéro");
				e.printStackTrace();
			}finally {
				System.out.println("merci de votre participation");
			}
			sc.nextLine();
		}
	}
}
