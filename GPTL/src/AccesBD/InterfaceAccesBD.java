/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AccesBD;

import java.sql.SQLException;

/**
 *
 * @author benkiranemohamedali
 */
public class InterfaceAccesBD {
    
    private AccesBDInfo acces;
    
    private boolean active;
    private String id;
    private int admin;
    
    public InterfaceAccesBD() throws SQLException
    {
        acces = new AccesBDInfo();
    }
    
    public boolean connect(String id, String password) throws SQLException
    {
        acces.reqPassword.setString(1, id);
        String pwd = acces.reqPassword.executeQuery().getString("PWD");
        
        if (pwd == password)
        {
            active = true;
            this.id = id;
            acces.reqType.setString(1, id);
            admin = acces.reqType.executeQuery().getInt("ADMIN");
        }
        else
        {
            active = false;
        }
        return active;
    }
    
    public boolean estAdmin()
    {
        return (admin == 1);
    }
}
