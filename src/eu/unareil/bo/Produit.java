package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private long refProd;
    private String marque;
    private String libelle;
    private long qteStock;
    private float prixUnitaire;
    List<Produit> produits = new ArrayList<>();

    public Produit() {
        super();
    }
    public Produit(long refProd, String libelle, String marque, long qteStock, float prixUnitaire) {
        this.setRefProd(refProd);
        this.setLibelle(libelle);
        this.setMarque(marque);
        this.setPrixUnitaire(prixUnitaire);
        this.setQteStock(qteStock);
    }

    public Produit(String marque, String libelle, long qteStock, float prixUnitaire) {
        this.setMarque(marque);
        this.setLibelle(libelle);
        this.setQteStock(qteStock);
        this.setPrixUnitaire(prixUnitaire);
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
