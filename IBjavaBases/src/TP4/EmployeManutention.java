package TP4;

public class EmployeManutention extends Employe{
	
	private int nbHeureEffectue;
	private boolean isRisque;
	public static int TAUX_HORAIRE = 65;
	
	public EmployeManutention(String nom, String prenom, String dateEmbauche, int nbHeureEffectue, boolean isRisque) throws EmployeConstructeurException {
		super(nom, prenom, dateEmbauche);
		this.isRisque = isRisque;
		this.categorie = "Manutention";
		this.nbHeureEffectue = nbHeureEffectue;
	}
	public double calculerSalaire() {		
		return (isRisque) ? this.nbHeureEffectue * TAUX_HORAIRE + 200 : this.nbHeureEffectue * TAUX_HORAIRE;
	}
}
