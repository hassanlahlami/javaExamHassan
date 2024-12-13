package org.example.javaExamHassan.DAO;

import org.example.javaExamHassan.Model.Incident;

import java.sql.SQLException;
import java.util.Set;

public interface IncidentSDAO {
    public void insere(Incident i)throws SQLException;
    public void inser(Set<Incident> is) throws  SQLException;
}
