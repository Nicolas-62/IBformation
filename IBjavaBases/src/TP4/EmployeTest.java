package TP4;

public class EmployeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entreprise vallourec = new Entreprise();
		try {
		vallourec.ajouterEmploye(new EmployeVente("lourdel", "nicolas", "16/01/1989", 30000));
		vallourec.ajouterEmploye(new EmployeRepresentation("", "fabrice", "16/08/1979", 20000));
		vallourec.ajouterEmploye(new EmployeProduction("leduey", "alexandre", "20/01/1990", 1000, false));
		vallourec.ajouterEmploye(new EmployeManutention("chirac", "jacques", "16/01/1989", 45, false));
		vallourec.ajouterEmploye(new EmployeProduction("al", "bator", "20/01/1990", 1000, true));
		vallourec.ajouterEmploye(new EmployeManutention("al", "abordage", "16/01/1989", 45, true));
		}catch(EmployeConstructeurException e) {
			System.out.println("message : " +e.getMessage());
			e.printStackTrace();
		}
		
		
		vallourec.afficherListeEmploye();
		vallourec.afficherSalaireMoyen();
		
		Personnel persoVallourec = new Personnel();
		Employe[] listEmploye = vallourec.getListeEmploye();
		
		for(int i=0; i<listEmploye.length; i++) {
			if(listEmploye[i] != null)
				persoVallourec.ajouterEmploye(listEmploye[i]);
		}
		persoVallourec.calculerSalaires();
		persoVallourec.afficherSalaireMoyen();
	}

}
