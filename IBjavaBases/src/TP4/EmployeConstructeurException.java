package TP4;

public class EmployeConstructeurException extends Exception {
	public EmployeConstructeurException(int n) {
		System.out.println(" l'employe n°"+n+" a un champ non valide : ");
	}
	public String getMessage() {
		return "get message";
	}
}
