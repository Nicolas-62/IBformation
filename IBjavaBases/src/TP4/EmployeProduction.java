package TP4;

public class EmployeProduction extends Employe{
	
	private int nbUniteProduite;
	private boolean isRisque;
	public static int COEF_PRODUCTION = 5;
	
	public EmployeProduction(String nom, String prenom, String dateEmbauche, int nbUniteProduite, boolean isRisque) throws EmployeConstructeurException{
		super(nom, prenom, dateEmbauche);
		this.isRisque = isRisque;
		this.categorie = "Production";
		this.nbUniteProduite = nbUniteProduite;
	}
	public double calculerSalaire() {		
		return (isRisque) ? this.nbUniteProduite * COEF_PRODUCTION + 200 : this.nbUniteProduite * COEF_PRODUCTION;
	}
}
