package eu.unareil.bo;

import java.time.LocalDate;

public class Glace extends ProduitPerissable{
    private String parfum;
    private int temperatureConservation;
    private long id;

    public Glace(LocalDate dateLimiteDeConso, long id) {
        super(dateLimiteDeConso, id);
    }

    public Glace(long refProd, String libelle, String marque, long qteStock, float prixUnitaire, LocalDate dateLimiteDeConso, String parfum, int temperatureConservation, long id) {
        super(refProd, libelle, marque, qteStock, prixUnitaire, dateLimiteDeConso, id);
        this.parfum = parfum;
        this.temperatureConservation = temperatureConservation;
        this.id = id;
    }

    public Glace(String marque, String libelle, long qteStock, float prixUnitaire, LocalDate dateLimiteDeConso, String parfum, int temperatureConservation, long id) {
        super(marque, libelle, qteStock, prixUnitaire, dateLimiteDeConso, id);
        this.parfum = parfum;
        this.temperatureConservation = temperatureConservation;
    }

    public String getParfum() {
        return parfum;
    }

    public void setParfum(String parfum) {
        this.parfum = parfum;
    }

    public int getTemperatureConservation() {
        return temperatureConservation;
    }

    public void setTemperatureConservation(int temperatureConservation) {
        this.temperatureConservation = temperatureConservation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Glace{");
        sb.append("parfum='").append(parfum).append('\'');
        sb.append(", temperatureConservation=").append(temperatureConservation);
        sb.append(", id=").append(id);
        sb.append(", produits=").append(produits);
        sb.append('}');
        return sb.toString();
    }
}
