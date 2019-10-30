package TP4;

public class Entreprise {
	
	public static int MAX_EMPLOYE = 30;
	private Employe[] listeEmploye = new Employe[MAX_EMPLOYE];
	
	public void ajouterEmploye(Employe newEmploye) {
		for(int i=0; i < listeEmploye.length; i++) {
			if(listeEmploye[i] == null) {
				listeEmploye[i] = newEmploye;
				break;
			}
		}
	}
	
	public void afficherListeEmploye() {
		for(Employe employe : this.listeEmploye) {
			if(employe != null) {
				System.out.println(employe);
			}
		}
	}	
	public double calculerSalaireMoyen() {
		double totalSalaire=0;
		for(Employe employe : this.listeEmploye) {
			if(employe != null) {
				totalSalaire+=employe.calculerSalaire();
			}
		}
		return totalSalaire / Employe.nbEmploye;
	}
	public void afficherSalaireMoyen() {
		System.out.println(String.format("salaire moyen : %g", this.calculerSalaireMoyen()));
	}
	public Employe[] getListeEmploye() {
		return this.listeEmploye;
	}
}
