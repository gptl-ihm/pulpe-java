/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connexion;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author benkiranemohamedali
 */
public class ConnexionOracleFactory {
    
     public static Connection creerConnexion()
     {
         Connection connexionBD;
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
        return connexionBD;
    }
}
