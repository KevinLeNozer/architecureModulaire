package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private long refProd;
    private String marque;
    private String libelle;
    private float prixUnitaire;
    private long qteStock;
    List<Produit> produits = new ArrayList<>();

    public Produit() {
        super();
    }
    public Produit(long refProd, String libelle, String marque, float prixUnitaire, long qteStock) {
        this.setRefProd(refProd);
        this.setLibelle(libelle);
        this.setMarque(marque);
        this.setPrixUnitaire(prixUnitaire);
        this.setQteStock(qteStock);
    }

    public Produit(String marque, String libelle, float prixUnitaire, long qteStock) {
        this.marque = marque;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.qteStock = qteStock;
    }

    public long getRefProd() {
        return refProd;
    }

    public void setRefProd(long refProd) {
        this.refProd = refProd;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public long getQteStock() {
        return qteStock;
    }

    public void setQteStock(long qteStock) {
        this.qteStock = qteStock;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

}
