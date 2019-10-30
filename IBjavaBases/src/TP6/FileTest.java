package TP6;

import java.io.File;


public class FileTest {
	
	public static long tailleTotal=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File file = new File("C:\\WINDOWS\\System32\\dsc");
			if(file.isDirectory()) {
				System.out.println("le repertoire existe : " + file.getAbsolutePath());
				File[] files = file.listFiles();
				afficherDesFichiers(files);
			}else{
				System.out.println("c'est un fichier");
				afficherUnFichier(file);
			}	
			System.out.println("taille totale des fichiers : " + tailleTotal);
	}
	
	public static void afficherUnFichier(File fichier) {
		
		tailleTotal+=fichier.length();
		System.out.println(String.format("%5s %5s %5s \t %-20s %-20s", "r","w","x","taille en octet","nom"));
		System.out.println(
				String.format("%5s %5s %5s \t %-20s %-20s", 
						fichier.canRead(),fichier.canWrite(),fichier.canExecute(), 
						fichier.length(), 
						fichier.getName()));	
	}
	
	public static void afficherDesFichiers(File[] files) {
		for(int i=0; i<files.length; i++) {
			
			if(!files[i].isDirectory())				
				afficherUnFichier(files[i]);	
			else {
				System.out.println("-----------------------------------------------------");
				System.out.println("le repertoire existe : " + files[i].getAbsolutePath());
				File[] sousfiles = files[i].listFiles();
				afficherDesFichiers(sousfiles);
			}
		}	
	}
}
