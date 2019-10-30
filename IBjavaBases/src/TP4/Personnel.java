package TP4;

import java.util.ArrayList;

public class Personnel {
	
	ArrayList<Employe> listEmploye = new ArrayList<Employe>();
	
	public void ajouterEmploye(Employe newEmploye) {
		this.listEmploye.add(newEmploye);
	}
	
	public void calculerSalaires() {
		for(Employe employe : this.listEmploye) {
			System.out.println(employe.calculerSalaire());
		}
	}
	public double salaireMoyen() {
		double salaireTotal=0;
		for(Employe employe : this.listEmploye) {
			salaireTotal +=employe.calculerSalaire();
		}
		return salaireTotal / listEmploye.size();
	}
	public void afficherSalaireMoyen() {
		System.out.println(String.format("salaire moyen ; %g", this.salaireMoyen()));
	}

}
