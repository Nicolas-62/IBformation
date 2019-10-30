package TP4;

public class EmployeVente extends Employe {
	
	private double caMensuel;
	
	public EmployeVente(String nom, String prenom, String dateEmbauche, double caMensuel) throws EmployeConstructeurException{
		super(nom, prenom, dateEmbauche);
		this.categorie = "Vente";
		this.caMensuel = caMensuel;
	}
	public double calculerSalaire() {
		return this.caMensuel * 0.2 + 400;
	}

}
