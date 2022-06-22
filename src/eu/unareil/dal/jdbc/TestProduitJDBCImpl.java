package eu.unareil.dal.jdbc;

import eu.unareil.bo.Glace;
import eu.unareil.bo.Pain;
import eu.unareil.bo.Produit;
import eu.unareil.bo.Stylo;
import eu.unareil.dal.DALException;

import java.time.LocalDate;
import java.util.List;

public class TestProduitJDBCImpl {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Insert du Pain
       /*ProduitsJDBCImpl elJdbc = new ProduitsJDBCImpl();
        try {
            //Insert du pain
            Pain pain = new Pain("blé dur2", "Tradition", 125, 500, 3.75f);
            elJdbc.insert(pain);

            //Insert de la glace
            Glace glace = new Glace(LocalDate.of(2020, 2, 12),"Miko", "Cône", -18, "Fraise", 1000, 2.75f);
            elJdbc.insert(glace);

            //Insert du stylo
             Stylo stylo = new Stylo("Stabilo","Point 88 - la Cerisaie", 10000, 2.50f, "bleu", "Stylo à bille");
             elJdbc.insert(stylo);

        } catch (DALException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        ProduitsJDBCImpl elJdbc2 = new ProduitsJDBCImpl();
        try {
            List<Produit> maListe = elJdbc2.selectAll();
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
