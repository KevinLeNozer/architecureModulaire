package eu.unareil.dal.jdbc;

import eu.unareil.bo.*;
import eu.unareil.dal.DALException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProduitsJDBCImpl implements DAO<Produit>{

    private static final String SQL_INSERT = "insert into produit (marque, libelle, qteStock, " +
            "prixUnitaire, type, dateLimiteConso, poids, parfum, temperatureConservation, couleur, typeMine, typeCartePostale)" + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE = "delete from produit where refProd=?";
    private static final String SQL_SELECT_BY_ID = "select * from produit where refProd=?";
    private static final String SQL_SELECT_ALL = "select * from produit";
    @Override
    public void insert(Produit data) throws DALException {
        PreparedStatement pstmt = null;
        Connection cnx = JDBCTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, data.getMarque());
            pstmt.setString(2, data.getLibelle());
            pstmt.setLong(3, data.getQteStock());
            pstmt.setFloat(4, data.getPrixUnitaire());

            if (data instanceof Pain) {
                pstmt.setString(5, "pain");
                pstmt.setDate(6, Date.valueOf(((Pain) data).getDateLimiteDeConso()));
                pstmt.setFloat(7, ((Pain) data).getPoids());
                pstmt.setNull(8, Types.NULL);
                pstmt.setNull(9, Types.NULL);
                pstmt.setNull(10, Types.NULL);
                pstmt.setNull(11, Types.NULL);
                pstmt.setNull(12, Types.NULL);
            } else if (data instanceof Glace) {
                pstmt.setString(5, "glace");
                pstmt.setDate(6, Date.valueOf(((Glace) data).getDateLimiteDeConso()));
                pstmt.setNull(7, Types.NULL);
                pstmt.setString(8, ((Glace) data).getParfum());
                pstmt.setInt(9, ((Glace) data).getTemperatureConservation());
                pstmt.setNull(10, Types.NULL);
                pstmt.setNull(11, Types.NULL);
                pstmt.setNull(12, Types.NULL);
            } else if (data instanceof Stylo) {
                pstmt.setNull(11, Types.VARCHAR);
                pstmt.setNull(12, Types.VARCHAR);
            } else if (data instanceof CartePostale) {
                pstmt.setNull(12, Types.VARCHAR);
            }
            System.out.println(pstmt);
            int nbRow = pstmt.executeUpdate();
            if (nbRow == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    data.setRefProd(rs.getLong(1));
                }
            }

        } catch (SQLException e) {
            throw new DALException("Erreur du insert - data=" + data, e);
        }
        finally
        {
            try {
                if(pstmt != null)
                {
                    pstmt.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                throw new DALException("erreur du insert au niveau du close- data=" + data, e);
            }
        }
    }

    @Override
    public void delete(Produit data) throws DALException {
        PreparedStatement pstmt = null;
        long id  = data.getRefProd();
        Connection cnx = JDBCTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_DELETE);
            pstmt.setLong(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new DALException("Erreur du delete - id=" + id, e);
        }
        finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (cnx != null) {
                    cnx.close();
                }
            } catch (SQLException e) {
                throw new DALException("Erreur du delete - id=" + id, e);
            }
        }
    }

    @Override
    public Produit selectById(long id) throws DALException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Produit el = null;
        Connection cnx = JDBCTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_SELECT_BY_ID);
            pstmt.setLong(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                el = new Produit(rs.getString(1), rs.getString(2), rs.getLong(3), rs.getFloat(4));
            }

        } catch (SQLException e) {
            throw new DALException("Erreur du select by id - id=" + id, e);
        }
        finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                throw new DALException("Erreur du select by id - id=" + id, e);
            }
        }
        return el;
    }

    @Override
    public List<Produit> selectAll() throws DALException {
        Connection cnx = JDBCTools.getConnection();
        // TODO Auto-generated method stub
        Statement stmt=null;
        ResultSet rs=null;
        List<Produit> lesElements= new ArrayList<>();
        Produit el = null;
        try {
            stmt = cnx.createStatement();
            rs = stmt.executeQuery(SQL_SELECT_ALL);
            while(rs.next())
            {
                if (rs.getString(6).equals("Stylo")) {
                    Stylo stylo = new Stylo(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getLong(4), rs.getFloat(5), rs.getString(11), rs.getString(12));
                    lesElements.add(stylo);
                } else if (rs.getString(6).equals("Pain")) {
                    el = new Pain(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getFloat(5), rs.getLong(4), rs.getFloat(8));
                    lesElements.add(el);
                }

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new DALException("erreur du select all",e);
        }
        finally
        {
            try {
                if(stmt!=null)
                {
                    stmt.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                throw new DALException("erreur du select all au niveau du close- ",e);
            }
        }
        return lesElements;
    }
}



