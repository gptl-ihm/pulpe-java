package AccesBD;

import Connexion.ConnexionOracleFactory;
import java.beans.Statement;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author benkiranemohamedali
 */
public class AccesBDInfo {
    private Connection connexionBD;
    private java.sql.Statement stmt;
    PreparedStatement reqPassword;
    PreparedStatement reqType;
    
    public AccesBDInfo () throws SQLException
    {
        connexionBD = ConnexionOracleFactory.creerConnexion();
        initStatement();
    }

    private void initStatement() throws SQLException{
        stmt = connexionBD.createStatement();
        reqPassword = connexionBD.prepareStatement("select PWD from Connexion where ID = ?");
        reqType = connexionBD.prepareStatement("select ADMIN from Connexion where ID = ?");
    }
}
