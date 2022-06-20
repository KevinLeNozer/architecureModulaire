package eu.unareil.bo;

import java.util.List;

public class CartePostale extends Produit{
    private String type;
    private long id;

    public CartePostale() {
        super();
    }

    public CartePostale(long refProd, String libelle, String marque, float prixUnitaire, long qteStock, String type, long id) {
        super(refProd, libelle, marque, prixUnitaire, qteStock);
        this.type = type;
        this.id = id;
    }

    public CartePostale(String marque, String libelle, float prixUnitaire, long qteStock, String type, long id) {
        super(marque, libelle, prixUnitaire, qteStock);
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CartePostale{");
        sb.append("type='").append(type).append('\'');
        sb.append(", id=").append(id);
        sb.append(", produits=").append(produits);
        sb.append('}');
        return sb.toString();
    }
}
