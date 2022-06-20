package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class Auteur {
    private String prenom;
    private String nom;
    private long id;

    List<Auteur> lesAuteursDeLaCarte = new ArrayList<>();

    public Auteur() {
        super();
    }
    public Auteur(String prenom, String nom, List<Auteur> lesAuteursDeLaCarte) {
        this.setPrenom(prenom);
        this.setNom(nom);
        this.setLesAuteursDeLaCarte(lesAuteursDeLaCarte);
    }

    public Auteur(String prenom, String nom, long id, List<Auteur> lesAuteursDeLaCarte) {
        this(prenom, nom, lesAuteursDeLaCarte);
        this.setId(id);
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Auteur> getLesAuteursDeLaCarte() {
        return lesAuteursDeLaCarte;
    }

    public void setLesAuteursDeLaCarte(List<Auteur> lesAuteursDeLaCarte) {
        this.lesAuteursDeLaCarte = lesAuteursDeLaCarte;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Auteur{");
        sb.append("prenom='").append(prenom).append('\'');
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", id=").append(id);
        sb.append(", lesAuteursDeLaCarte=").append(lesAuteursDeLaCarte);
        sb.append('}');
        return sb.toString();
    }
}
