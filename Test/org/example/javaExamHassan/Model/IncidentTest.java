package org.example.javaExamHassan.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

public class IncidentTest {

    private Incident incident;
    private Membre membre;

    @BeforeEach
    public void setUp() {
        // Create a dummy Membre object for testing
        membre = new Membre("Doe", "John", "john.doe@example.com", "123-456-7890",null);

        // Create an instance of Incident for testing
        incident = new Incident("INC123", new Date(System.currentTimeMillis()), membre, "Open");
    }

    @Test
    public void testGetReference() {
        assertEquals("INC123", incident.getReference(), "Reference should be correctly retrieved.");
    }

    @Test
    public void testSetReference() {
        incident.setReference("INC456");
        assertEquals("INC456", incident.getReference(), "Reference should be correctly set.");
    }

    @Test
    public void testGetTime() {
        Date expectedDate = new Date(System.currentTimeMillis());
        assertEquals(expectedDate.toString(), incident.getTime().toString(), "Time should be correctly retrieved.");
    }

    @Test
    public void testSetTime() {
        Date newDate = new Date(System.currentTimeMillis() + 1000000);
        incident.setTime(newDate);
        assertEquals(newDate.toString(), incident.getTime().toString(), "Time should be correctly set.");
    }

    @Test
    public void testGetStatus() {
        assertEquals("Open", incident.getStatus(), "Status should be correctly retrieved.");
    }

    @Test
    public void testSetStatus() {
        incident.setStatus("Closed");
        assertEquals("Closed", incident.getStatus(), "Status should be correctly set.");
    }

    @Test
    public void testGetMembre() {
        assertNotNull(incident.getMembre(), "Membre should not be null.");
        assertEquals(membre, incident.getMembre(), "Membre should be correctly retrieved.");
    }

    @Test
    public void testSetMembre() {
        Membre newMembre = new Membre("Smith", "Jane", "jane.smith@example.com", "987-654-3210",null);
        incident.setMembre(newMembre);
        assertEquals(newMembre, incident.getMembre(), "Membre should be correctly set.");
    }
}
