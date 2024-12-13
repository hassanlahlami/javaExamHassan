package org.example.javaExamHassan.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestionDB {

    public Connection connexion;
    public void connecte(String BD, String User, String Password) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/" + BD;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            this.connexion = DriverManager.getConnection(url, User, Password);
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
            throw new SQLException("JDBC Driver not found.", e);
        } catch (SQLException e) { // exception du driver
            System.err.println("Erreur de connexion à la base de données : " + e.getMessage());
            throw e;
        }
    }

    public void close(){
        try {
            if (connexion != null) {
                connexion.close();
            }
        }catch (SQLException e) {
            System.err.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
        }
    }
}
