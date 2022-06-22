package eu.unareil.dal.jdbc;

import eu.unareil.bo.*;
import eu.unareil.dal.DALException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProduitsJDBCImpl implements DAO<Produit>{

    private static final String SQL_INSERT = "insert into produit (libelle, marque, qteStock, prixUnitaire, dateLimiteConso, poids, parfum, temperatureConservation, couleur, typeMine, typeCartePostal)" +
            "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE = "delete from produit where refProd=?";
    private static final String SQL_SELECT_BY_ID = "select * from produit where refProd=?";
    private static final String SQL_SELECT_ALL = "select * from produit";
    @Override
    public void insert(Produit data) throws DALException {
        PreparedStatement pstmt = null;
        Connection cnx = JDBCTools.getConnection();
        try {
            pstmt = cnx.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, data.getLibelle());
            pstmt.setString(2, data.getMarque());
            pstmt.setLong(3, data.getQteStock());
            pstmt.setFloat(4, data.getPrixUnitaire());

            if (data instanceof Pain) {
                pstmt.setNull(6, Types.INTEGER);
                pstmt.setNull(7, Types.DATE);
            } else if (data instanceof Glace) {
                pstmt.setNull(6, Types.INTEGER);
                pstmt.setNull(7, Types.DATE);
                pstmt.setNull(8, Types.INTEGER);
                pstmt.setNull(9, Types.VARCHAR);
                pstmt.setNull(10, Types.INTEGER);
            } else if (data instanceof Stylo) {
                pstmt.setNull(11, Types.VARCHAR);
                pstmt.setNull(12, Types.VARCHAR);
            } else if (data instanceof CartePostale) {
                pstmt.setNull(12, Types.VARCHAR);
            }
            int nbRow = pstmt.executeUpdate();
            if (nbRow == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    data.setRefProd(rs.getLong(1));
                }
            }

        } catch (SQLException e) {
            throw new DALException("Erreur du insert - data=" + data, e.getCause());
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
                throw new DALException("erreur du insert au niveau du close- data=" + data, e.getCause());
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
            throw new DALException("Erreur du delete - id=" + id, e.getCause());
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
                throw new DALException("Erreur du delete - id=" + id, e.getCause());
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
            throw new DALException("Erreur du select by id - id=" + id, e.getCause());
        }
        finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                throw new DALException("Erreur du select by id - id=" + id, e.getCause());
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
        Produit el=null;
        //Connection cnx=null;
        try {
            stmt=cnx.createStatement();
            rs=stmt.executeQuery(SQL_SELECT_ALL);
            while(rs.next())
            {
                el = new Produit(rs.getString(1), rs.getString(2), rs.getLong(3), rs.getFloat(4));
                lesElements.add(el);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            throw new DALException("erreur du select all",e.getCause());
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
                throw new DALException("erreur du select all au niveau du close- ",e.getCause());
            }
        }
        return lesElements;
    }

}


