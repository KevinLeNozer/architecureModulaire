package eu.unareil.bo;

import java.time.LocalDate;

public class Pain extends ProduitPerissable{
    private int poids;

    public Pain(LocalDate dateLimiteDeConso, long id, int poids) {
        super(dateLimiteDeConso, id);
        this.poids = poids;
    }

    public Pain(long refProd, String libelle, String marque, long qteStock, float prixUnitaire, LocalDate dateLimiteDeConso, long id, int poids) {
        super(refProd, libelle, marque, qteStock, prixUnitaire, dateLimiteDeConso, id);
        this.poids = poids;
    }

    public Pain(String marque, String libelle, long qteStock, float prixUnitaire, LocalDate dateLimiteDeConso, long id, int poids) {
        super(marque, libelle, qteStock, prixUnitaire, dateLimiteDeConso, id);
        this.poids = poids;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pain{");
        sb.append("poids=").append(poids);
        sb.append(", produits=").append(produits);
        sb.append('}');
        return sb.toString();
    }
}
