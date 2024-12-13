package org.example.javaExamHassan.DAO;

import org.example.javaExamHassan.Model.Incident;
import org.example.javaExamHassan.Model.Membre;

import java.sql.SQLException;
import java.util.List;

public interface MembreDAO {
    public void inserer(Membre M) throws SQLException,ClassNotFoundException;
    public List<Incident> chargerListeIncidents() throws SQLException,ClassNotFoundException;
    public String getLastMemberId() throws SQLException,ClassNotFoundException;
}
