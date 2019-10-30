package TP4;

public interface GestionnairePaie {
	default void alert() {
		System.out.println("alert");
	}
	public double calculerSalaire();

}
