package com.nico.IBjavaBdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {

            System.out.println("Driver O.K.");
            String url = "jdbc:mysql://localhost/Ecole" +
					"?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
            String user = "root";
            String passwd = "formation";
            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");                        
            //Création d'un objet Statement
            Statement state = conn.createStatement();
            
            //L'objet ResultSet contient le résultat de la requête SQL
            ResultSet result = state.executeQuery("SELECT * FROM classe");
            //On récupère les MetaData
            ResultSetMetaData resultMeta = result.getMetaData();
               
            System.out.println("\n**********************************");
            //On affiche le nom des colonnes
            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
              System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
               
            System.out.println("\n**********************************");
               
            while(result.next()){         
              for(int i = 1; i <= resultMeta.getColumnCount(); i++) {
            	  if(result.getObject(i)!=null) {
            		  System.out.print("\t" + result.getObject(i).toString() + "\t |");
            	  }
              }
                  
              System.out.println("\n---------------------------------");

            }

            result.close();
            state.close();
               
          } catch (Exception e) {
            e.printStackTrace();
          }    
    }
}
