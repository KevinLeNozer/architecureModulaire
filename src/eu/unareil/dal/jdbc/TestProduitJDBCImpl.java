package eu.unareil.dal.jdbc;

import eu.unareil.bo.Produit;
import eu.unareil.dal.DALException;

import java.util.List;

public class TestProduitJDBCImpl {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ProduitsJDBCImpl elJdbc = new ProduitsJDBCImpl();
        try {
            List<Produit> maListe = elJdbc.selectAll();
            for(Produit el: maListe)
            {
                System.out.println(el);
            }
        } catch (DALException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
