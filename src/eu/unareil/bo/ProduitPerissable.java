package eu.unareil.bo;

import javax.swing.*;
import java.time.LocalDate;

public class ProduitPerissable extends Produit{
    private LocalDate dateLimiteDeConso;
    private long id;

    public ProduitPerissable(LocalDate dateLimiteDeConso, long id) {
        this.dateLimiteDeConso = dateLimiteDeConso;
        this.id = id;
    }

    public ProduitPerissable(long refProd, String libelle, String marque, long qteStock, float prixUnitaire, LocalDate dateLimiteDeConso, long id) {
        super(refProd, libelle, marque, qteStock, prixUnitaire);
        this.dateLimiteDeConso = dateLimiteDeConso;
        this.id = id;
    }

    public ProduitPerissable(String marque, String libelle, long qteStock, float prixUnitaire, LocalDate dateLimiteDeConso, long id) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.dateLimiteDeConso = dateLimiteDeConso;
        this.id = id;
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
