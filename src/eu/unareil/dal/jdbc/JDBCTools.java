package eu.unareil.dal.jdbc;

import eu.unareil.dal.DALException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTools {

    public static Connection getConnection() throws DALException {

        String db = String.format("jdbc:mariadb://%s:%s/%s?user=%s&password=%s",
                Settings.getProperty("serveur"), Settings.getProperty("port"),
                Settings.getProperty("db"), Settings.getProperty("user"), Settings.getProperty(
                        "password"));

        Connection cnx = null;
        try {
            cnx = DriverManager.getConnection(db);
        } catch (SQLException e) {
           throw new DALException("Erreur de connexion à la base de données",e.getCause());
        }
        return cnx;
    }
}
