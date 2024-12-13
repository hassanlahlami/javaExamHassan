package org.example.javaExamHassan.Model;

import java.sql.Date;

public class Incident {
    private String reference;
    private Date time;
    private String Status;
    private Membre membre;

    public Incident(String reference, Date time, Membre membre, String status) {
        this.reference = reference;
        this.time = time;
        this.membre = membre;
        Status = status;
    }
    public Incident(){

    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
