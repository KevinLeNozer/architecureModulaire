package eu.unareil.bo;

import java.util.List;

public class Stylo extends Produit{
    private String couleur;
    private String typeMine;
    private long id;

    public Stylo() {
        super();
    }

    public Stylo(long refProd, String libelle, String marque, float prixUnitaire, long qteStock, String couleur, String typeMine, long id) {
        super(refProd, libelle, marque, prixUnitaire, qteStock);
        this.couleur = couleur;
        this.typeMine = typeMine;
        this.id = id;
    }

    public Stylo(String marque, String libelle, float prixUnitaire, long qteStock, String couleur, String typeMine, long id) {
        super(marque, libelle, prixUnitaire, qteStock);
        this.couleur = couleur;
        this.typeMine = typeMine;
        this.id = id;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getTypeMine() {
        return typeMine;
    }

    public void setTypeMine(String typeMine) {
        this.typeMine = typeMine;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
