package eu.unareil.bo;

public class Stylo extends Produit{
    private String couleur;
    private String typeMine;
    private long id;

    public Stylo() {
        super();
    }

    public Stylo(long refProd, String libelle, String marque, long qteStock, float prixUnitaire, String couleur, String typeMine, long id) {
        super(refProd, libelle, marque, qteStock, prixUnitaire);
        this.setCouleur(couleur);
        this.setTypeMine(typeMine);
        this.setId(id);
    }

    public Stylo(String marque, String libelle, float prixUnitaire, long qteStock, String couleur, String typeMine) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.setCouleur(couleur);
        this.setTypeMine(typeMine);
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Stylo{");
        sb.append("couleur='").append(couleur).append('\'');
        sb.append(", typeMine='").append(typeMine).append('\'');
        sb.append(", id=").append(id);
        sb.append(", produits=").append(produits);
        sb.append('}');
        return sb.toString();
    }
}
