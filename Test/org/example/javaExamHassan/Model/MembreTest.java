package org.example.javaExamHassan.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MembreTest {

    private Membre membre1;
    private Membre membre2;

    @BeforeEach
    public void setUp() {
        // Create Membre objects for testing
        membre1 = new Membre("ID001", "Doe", "John", "john.doe@example.com", "123-456-7890", null);
        membre2 = new Membre("ID002", "Smith", "Jane", "jane.smith@example.com", "987-654-3210", null);
    }

    @Test
    public void testGetIdentifiant() {
        assertEquals("ID001", membre1.getIdentifiant(), "Identifiant should be correctly retrieved.");
    }

    @Test
    public void testSetIdentifiant() {
        membre1.setIdentifiant("ID003");
        assertEquals("ID003", membre1.getIdentifiant(), "Identifiant should be correctly set.");
    }

    @Test
    public void testGetNom() {
        assertEquals("Doe", membre1.getNom(), "Nom should be correctly retrieved.");
    }

    @Test
    public void testSetNom() {
        membre1.setNom("Brown");
        assertEquals("Brown", membre1.getNom(), "Nom should be correctly set.");
    }

    @Test
    public void testGetPrenom() {
        assertEquals("John", membre1.getPrenom(), "Prenom should be correctly retrieved.");
    }

    @Test
    public void testSetPrenom() {
        membre1.setPrenom("Michael");
        assertEquals("Michael", membre1.getPrenom(), "Prenom should be correctly set.");
    }

    @Test
    public void testGetEmail() {
        assertEquals("john.doe@example.com", membre1.getEmail(), "Email should be correctly retrieved.");
    }

    @Test
    public void testSetEmail() {
        membre1.setEmail("john.brown@example.com");
        assertEquals("john.brown@example.com", membre1.getEmail(), "Email should be correctly set.");
    }

    @Test
    public void testGetPhone() {
        assertEquals("123-456-7890", membre1.getPhone(), "Phone should be correctly retrieved.");
    }

    @Test
    public void testSetPhone() {
        membre1.setPhone("111-222-3333");
        assertEquals("111-222-3333", membre1.getPhone(), "Phone should be correctly set.");
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(membre1.equals(membre1), "The same object should be considered equal.");
    }

    @Test
    public void testEqualsDifferentObject() {
        assertFalse(membre1.equals(membre2), "Different objects should not be considered equal.");
    }

    @Test
    public void testEqualsNullObject() {
        assertFalse(membre1.equals(null), "An object should not be equal to null.");
    }

    @Test
    public void testEqualsDifferentClass() {
        String str = "Some String";
        assertFalse(membre1.equals(str), "A Membre object should not be equal to a non-Membre object.");
    }

    @Test
    public void testEqualsSameIdentifiant() {
        Membre membre3 = new Membre("ID001", "Alice", "Wonder", "alice.wonder@example.com", "333-444-5555", null);
        assertTrue(membre1.equals(membre3), "Membres with the same identifiant should be considered equal.");
    }

    @Test
    public void testEqualsDifferentIdentifiant() {
        Membre membre4 = new Membre("ID004", "Charlie", "Brown", "charlie.brown@example.com", "666-777-8888", null);
        assertFalse(membre1.equals(membre4), "Membres with different identifiant should not be considered equal.");
    }
}
