package eu.unareil.bo;

import java.util.ArrayList;
import java.util.List;

public class Achat {
    private Double montant;

    List<Ligne> lignes = new ArrayList<>();

    public Achat(Ligne ligne) {
        lignes.add(ligne);
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public List<Ligne> getLignes() {
        return lignes;
    }

    public Ligne getLigne(int index) {
        return lignes.get(index);
    }

    public void ajouteLigne(Produit p, int qte) {
        lignes.add(new Ligne(p, qte));
    }

    public void modifieLigne(int index, int nouvelleQte) {
        lignes.get(index).setQuantite(nouvelleQte);
    }

    public void supprimeLigne(int index) {
        lignes.remove(lignes.get(index));
    }

    public Double caclulMontant() {
        for (Ligne ligne : lignes) {
            montant+= ligne.getPrix();
        }
        return montant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Achat{");
        sb.append("montant=").append(montant);
        sb.append(", lignes=").append(lignes);
        sb.append('}');
        return sb.toString();
    }
}
