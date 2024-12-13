package org.example.javaExamHassan.Model;

import java.util.List;
import java.util.Objects;

public class Membre {
    private String identifiant;
    private String nom;
    private String prenom;
    private String email;
    private String phone;
    private List<Incident> incidents;

    public Membre(String identifiant, String nom, String prenom, String email, String phone,List <Incident>incidents) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
        this.incidents=incidents;
    }

    public Membre(String identifiant,String nom, String prenom, String email, String phone) {
        this.nom = nom;
        this.identifiant = identifiant;
        this.prenom = prenom;
        this.email = email;
        this.phone = phone;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public boolean equals(Object obj){
        if(this== obj){
            return true;
        }
        if (obj==null || !(obj instanceof Membre)){
            return false;
        }
        Membre newMembre=(Membre) obj;
        return newMembre.getIdentifiant()==this.getIdentifiant();
    }
}