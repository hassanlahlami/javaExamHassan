package org.example.javaExamHassan;

import org.example.javaExamHassan.DAO.MembreDAOImpl;
import org.example.javaExamHassan.Model.Membre;

import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

public class InsertInCSV {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MembreDAOImpl membreDAO = new MembreDAOImpl();
        String currentPath = Paths.get("").toAbsolutePath().toString().replace("\\", "/");
        System.out.println(currentPath);
        Set<Membre>membres=membreDAO.chargerListeMembre(currentPath+"/src/main/resources/CSV/Test.csv");
        for(Membre m:membres){
            System.out.println(m.getNom());
        }

    }
}
