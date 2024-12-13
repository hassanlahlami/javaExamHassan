package org.example.javaExamHassan.DAO;

import org.example.javaExamHassan.Database.GestionDB;
import org.example.javaExamHassan.Model.Incident;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;

public class IncidentDAOImpl implements IncidentSDAO{
    GestionDB gestionDB=new GestionDB();

    @Override
    public void insere(Incident i) throws SQLException {
        gestionDB.connecte("javaExamBlanc","root", "");
        String sql = "INSERT INTO incident (reference, time, status, identifiant_membre) VALUES (?, ?, ?,?)";
        try (PreparedStatement stmt = gestionDB.connexion.prepareStatement(sql)) {
            stmt.setString(1, i.getReference());
            stmt.setTimestamp(2, new Timestamp(i.getTime().getTime()));
            stmt.setString(3, i.getStatus());
            stmt.setString(4,i.getMembre().getIdentifiant());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inser(Set<Incident> is) throws SQLException {
        for (Incident i : is) {
            insere(i);
        }
    }
}
