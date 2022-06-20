package eu.unareil.bo;

import java.time.LocalDate;

public class Pain extends ProduitPerissable{
    private int poids;

    public Pain() {
        super();
    }

    public Pain(long refProd, String libelle, String marque, long qteStock, float prixUnitaire, LocalDate dateLimiteDeConso, int poids) {
        super(refProd, libelle, marque, qteStock, prixUnitaire, dateLimiteDeConso);
        this.poids = poids;
    }

    public Pain(LocalDate dateLimiteDeConso, String marque, String libelle, long qteStock, float prixUnitaire, int poids) {
        super(dateLimiteDeConso, marque, libelle, qteStock, prixUnitaire);
        this.poids = poids;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

}
