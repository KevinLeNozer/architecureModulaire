package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class Auteur {
    private String prenom;
    private String nom;


    public Auteur() {
        super();
    }
    public Auteur(String prenom, String nom) {
        this.setPrenom(prenom);
        this.setNom(nom);
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
        final StringBuffer sb = new StringBuffer("Auteur{");
        sb.append("prenom='").append(prenom).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
