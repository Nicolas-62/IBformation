package TP4;

public class EmployeRepresentation extends Employe {
	private double caMensuel;
	
	public EmployeRepresentation(String nom, String prenom, String dateEmbauche, double caMensuel) throws EmployeConstructeurException{
		super(nom, prenom, dateEmbauche);
		this.categorie = "Representation";
		this.caMensuel = caMensuel;
	}
	public double calculerSalaire() {
		return this.caMensuel * 0.2 + 800;
	}
}
