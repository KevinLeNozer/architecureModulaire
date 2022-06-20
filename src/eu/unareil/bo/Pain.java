package eu.unareil.bo;

import java.time.LocalDate;

public class Pain extends ProduitPerissable{
    private float poids;

    public Pain() {
        super();
    }

    public Pain(long refProd, String libelle, String marque, float poids, long qteStock, float prixUnitaire) {
        super(refProd, libelle, marque, qteStock, prixUnitaire,
                LocalDate.now().plusDays(2));
        this.setPoids(poids);
    }

    public Pain(String libelle, String marque, float poids, long qteStock, float prixUnitaire) {
        this(0, libelle, marque, poids, qteStock, prixUnitaire);
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pain{");
        sb.append(super.toString());
        sb.append("poids=").append(poids);
        sb.append('}');
        return sb.toString();
    }
}
