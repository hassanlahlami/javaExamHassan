package org.example.javaExamHassan.DAO;

import org.example.javaExamHassan.Model.Incident;
import org.example.javaExamHassan.Model.Membre;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface MembreDAO {
    public void inserer(Membre M) throws SQLException,ClassNotFoundException;
    public List<Incident> chargerListeIncidents() throws SQLException,ClassNotFoundException;
    public String getLastMemberId() throws SQLException,ClassNotFoundException;
    public Set<Membre> chargerListeMembre(String nomFichier) throws SQLException,ClassNotFoundException;
}
