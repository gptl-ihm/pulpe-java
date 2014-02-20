/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Métier;

/**
 *
 * @author benkiranemohamedali
 */
public class Court {
    String      numCourt;
    String      typeCourt;

//Constructeur
    public Court(String numCourt, String typeCourt) {
        this.numCourt = numCourt;
        this.typeCourt = typeCourt;
    }
    
//Getter des attributs
    public String getNumCourt() {
        return numCourt;
    }

    public String getTypeCourt() {
        return typeCourt;
    }
    
//Setter des attributs
    public void setNumCourt(String numCourt) {
        this.numCourt = numCourt;
    }

    public void setTypeCourt(String typeCourt) {
        this.typeCourt = typeCourt;
    }
    
    
}
