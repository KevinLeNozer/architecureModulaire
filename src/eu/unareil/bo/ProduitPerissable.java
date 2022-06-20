package eu.unareil.bo;

import javax.swing.*;
import java.time.LocalDate;

public class ProduitPerissable extends Produit{
    private LocalDate dateLimiteDeConso;

    public ProduitPerissable() {
        super();
    }

    public ProduitPerissable(long refProd, String libelle, String marque, long qteStock, float prixUnitaire,  LocalDate dateLimiteDeConso) {
        super(refProd, libelle, marque, qteStock, prixUnitaire);
        this.dateLimiteDeConso = dateLimiteDeConso;
    }

    public ProduitPerissable(LocalDate dateLimiteDeConso, String marque, String libelle, long qteStock, float prixUnitaire) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.dateLimiteDeConso = dateLimiteDeConso;
    }

    public LocalDate getDateLimiteDeConso() {
        return dateLimiteDeConso;
    }

    public void setDateLimiteDeConso(LocalDate dateLimiteDeConso) {
        this.dateLimiteDeConso = dateLimiteDeConso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProduitPerissable{");
        sb.append("dateLimiteDeConso=").append(dateLimiteDeConso);
        sb.append(", produits=").append(produits);
        sb.append('}');
        return sb.toString();
    }
}
