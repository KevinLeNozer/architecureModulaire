package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class Auteur {
    private int id;
    private String prenom;
    private String nom;


    public Auteur() {
        super();
    }
    public Auteur(String prenom, String nom) {
        this.setPrenom(prenom);
        this.setNom(nom);
    }

    public Auteur(int id, String prenom, String nom) {
        this(prenom, nom);
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Auteur{");
        sb.append("prenom='").append(prenom).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
