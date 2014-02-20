package AccesBD;

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
        creerConnexion();
        initStatement();
    }
    
    public void creerConnexion()
    {
        try{
            Properties props = new Properties();
            FileInputStream fichier = new FileInputStream("connexion.properties");
            props.load(fichier);
            OracleDataSource ods = new OracleDataSource();
            ods.setDriverType(props.getProperty("pilote"));
            ods.setPortNumber(new Integer(props.getProperty("port")).intValue());
            ods.setServiceName(props.getProperty("service"));
            ods.setUser(props.getProperty("user"));
            ods.setPassword(props.getProperty("pwd"));
            ods.setServerName(props.getProperty("serveur"));
            connexionBD = (ods.getConnection());
        }catch(Exception e){
            System.err.println("Erreur lors de la lecture du fichier de configuration pour la connexion");
            connexionBD = null;
        }
    }

    private void initStatement() throws SQLException{
        stmt = connexionBD.createStatement();
        reqPassword = connexionBD.prepareStatement("select PWD from Connexion where ID = ?");
        reqType = connexionBD.prepareStatement("select ADMIN from Connexion where ID = ?");
    }
}
