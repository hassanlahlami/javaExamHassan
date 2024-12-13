package org.example.javaExamHassan.DAO;

import org.example.javaExamHassan.Database.GestionDB;
import org.example.javaExamHassan.Model.Incident;
import org.example.javaExamHassan.Model.Membre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MembreDAOImpl implements MembreDAO {
    GestionDB gestionDB=new GestionDB();
    @Override
    public void inserer(Membre M) throws SQLException, ClassNotFoundException {
        gestionDB.connecte("javaExamBlanc","root", "");
        String req="insert into membre values(?,?,?,?,?)";
        try{
            PreparedStatement st=gestionDB.connexion.prepareStatement(req);
            st.setString(1,M.getIdentifiant());
            st.setString(2,M.getNom());
            st.setString(3,M.getPrenom());
            st.setString(4,M.getEmail());
            st.setString(5,M.getPhone());
            st.executeUpdate();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Incident> chargerListeIncidents() throws SQLException, ClassNotFoundException {
        String req="select * from incident";
        List<Incident> incidents=new ArrayList<>();
            gestionDB.connecte("javaExamBlanc","root","");
            PreparedStatement st=gestionDB.connexion.prepareStatement(req);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Incident i=new Incident();
                i.setReference(rs.getString("reference"));
                i.setTime(rs.getDate("time"));
                i.setStatus("status");
                incidents.add(i);
            }
        return  incidents;
    }
    @Override
    public String getLastMemberId() throws SQLException{
        gestionDB.connecte("javaExamBlanc","root", "");
        String id=null;
        String req="select identifiant from membre ORDER BY identifiant desc LIMIT 1";
        try{
            PreparedStatement st=gestionDB.connexion.prepareStatement(req);

            ResultSet rs=st.executeQuery();
            if(rs.next()){
                 id= rs.getString("identifiant");
            }
            else{
                id="0";
            }
            st.close();
            gestionDB.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return id;
    }
    public Set<Membre> chargerListeMembre(String nomFichier) throws SQLException, ClassNotFoundException {
        Set<Membre> membres = new HashSet<>();
        if (!nomFichier.endsWith(".csv")) {
            System.out.println("The file is not a CSV file.");
            return membres;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    String nom = data[0].trim();
                    String prenom = data[1].trim();
                    String email = data[2].trim();
                    String phone = data[3].trim();


                    Membre membre = new Membre(nom, prenom, email, phone);
                    membres.add(membre);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return membres;
    }
}
