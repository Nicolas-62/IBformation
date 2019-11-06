package com.jdbc.dao.IBjavaDAO;
import java.sql.*;

public class MaConnexion {
	private static String url = "jdbc:mysql://localhost/Ecole" +
								"?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	private static String utilisateur = "root";
	private static String motDePasse = "formation";
	private static Connection connexion = null;
	
	public MaConnexion() {
		try {
			connexion = DriverManager.getConnection(url,utilisateur, motDePasse);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// créer et retourner une connexion
	public static Connection getConnection() {
		if(connexion == null) {
			new MaConnexion();
		}
		return connexion;
	}
	// fermer la connexion à la bdd
	public static void stop() {
		if(connexion != null) {
			try {
				connexion.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
