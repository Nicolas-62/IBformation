package com.jdbc.dao.IBjavaDAO.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.dao.IBjavaDAO.pojo.Classe;

public class ClasseDAO extends DAO<Classe> {
	public ClasseDAO(Connection conn) {
		super(conn);
	}

	public boolean create(Classe obj) {
		PreparedStatement prep = null;
		try {
			String sqlAjouter = "insert into classe(cls_nom) values(?)";
			prep = connect.prepareStatement(sqlAjouter);
			prep.setString(1, obj.getNom());
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

	public boolean delete(Classe obj) {
		PreparedStatement prep = null;
		try {
			String sqlAjouter = "delete from classe where cls_id = ?";
			prep = connect.prepareStatement(sqlAjouter);
			prep.setInt(1, obj.getId());
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

	public boolean update(Classe obj) {
		PreparedStatement prep = null;
		try {
			String sqlAjouter = "update classe set cls_nom = ? where cls_id = ?";
			prep = connect.prepareStatement(sqlAjouter);
			prep.setString(1, obj.getNom());
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

	public Classe find(int id) {
		Classe classe = new Classe();
		try {
			ResultSet result = this.connect
					.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM classe WHERE cls_id = " + id);

			if (result.first()) {
				classe = new Classe(id, result.getString("cls_nom"));
			}

	        EleveDAO eleveDao = new EleveDAO(this.connect);
	        result = this.connect.createStatement().executeQuery(
	          "SELECT elv_id, elv_nom, elv_prenom FROM eleve " +
	          "INNER JOIN classe ON elv_cls_k = cls_id AND cls_id = " + id
	        );

	        while(result.next()) {
	          classe.addEleve(eleveDao.find(result.getInt("elv_id")));
	        }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return classe;
	}
}