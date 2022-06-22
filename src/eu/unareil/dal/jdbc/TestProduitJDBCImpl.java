package eu.unareil.dal.jdbc;

import eu.unareil.bo.*;
import eu.unareil.dal.DALException;

import java.time.LocalDate;
import java.util.List;

public class TestProduitJDBCImpl {

    public static void main(String[] args) {
        ProduitsJDBCImpl produitJdbc = new ProduitsJDBCImpl();
        AuteursJDBCImpl auteursJDBC = new AuteursJDBCImpl();
        // TODO Auto-generated method stub
        //Insert du Pain
        try {
            //Insert du pain
            /*Pain pain = new Pain("blé dur2", "Tradition", 125, 500, 3.75f);
            elJdbc.insert(pain);

            //Insert de la glace
            Glace glace = new Glace(LocalDate.of(2020, 2, 12),"Miko", "Cône", -18, "Fraise", 1000, 2.75f);
            elJdbc.insert(glace);

            //Insert du stylo
             Stylo stylo = new Stylo("Stabilo","Point 88 - la Cerisaie", 10000, 2.50f, "bleu", "Stylo à bille");
             elJdbc.insert(stylo);*/

//            Auteur auteurExemple = new Auteur("Kevin", "Le Nozer");
//
//
//                auteursJDBC.insert(auteurExemple);
//
            List<Auteur> auteurs = auteursJDBC.selectAll();
            for(Auteur auteur: auteurs)
            {
               System.out.println(auteur);
            }


//            List<Produit> produits = produitJdbc.selectAll();
//            for(Produit produit: produits)
//            {
//                System.out.println(produit);
//            }
//
//
//
//            Produit produitSelect = produitJdbc.selectById();
//            System.out.println("=> " + produitSelect.toString());
//
//            produitJdbc.delete(produitSelect);
//            System.out.println("Produit supprimé => " + produitSelect);

        }catch (DALException e) {
            e.printStackTrace();
        }

    }
}
