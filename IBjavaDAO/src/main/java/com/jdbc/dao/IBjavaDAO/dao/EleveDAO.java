package com.jdbc.dao.IBjavaDAO.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.dao.IBjavaDAO.MaConnexion;
import com.jdbc.dao.IBjavaDAO.pojo.Eleve;

public class EleveDAO extends DAO<Eleve> {
	public EleveDAO(Connection conn) {
		super(conn);
	}

	public boolean create(Eleve obj) {
		boolean success=false;
		PreparedStatement prep = null;
		try {
			String sqlAjouter = "insert into eleve(elv_nom, elv_prenom, elv_cls_k) values(?,?,?)";
			prep = connect.prepareStatement(sqlAjouter);
			prep.setString(1, obj.getNom());
			prep.setString(2, obj.getPrenom());
			prep.setInt(3,  obj.getClasse_id());
			prep.executeUpdate();
			prep.close();
			success= true;
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		return success;
	}

	public boolean delete(Eleve obj) {
		boolean success=false;
		PreparedStatement prep = null;
		try {
			String sqlAjouter = "delete from eleve where elv_id = ?";
			prep = connect.prepareStatement(sqlAjouter);
			prep.setInt(1, obj.getId());
			prep.executeUpdate();
			prep.close();
			success = true;
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		return success;
	}

	public boolean update(Eleve obj) {
		PreparedStatement prep = null;
		try {
			String sqlAjouter = "update eleve set elv_nom = ?, elv_prenom = ?, elv_cls_k = ? where elv_id = ?";
			prep = connect.prepareStatement(sqlAjouter);
			prep.setString(1, obj.getNom());
			prep.setString(2, obj.getPrenom());
			prep.setInt(3, obj.getClasse_id());
			prep.setInt(4, obj.getId());
			prep.executeUpdate();
			prep.close();
			return true;
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
			return false;
		}
	}

	public Eleve find(int id) {
		Eleve eleve = new Eleve();

		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM eleve WHERE elv_id = " + id);
			if (result.first())
				eleve = new Eleve(id, result.getString("elv_nom"), result.getString("elv_prenom"));
			// récupération classe de l'élève
			ClasseDAO classe = new ClasseDAO(MaConnexion.getConnection());			
			eleve.setClasse(classe.find(eleve.getClasse_id()));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return eleve;
	}
}