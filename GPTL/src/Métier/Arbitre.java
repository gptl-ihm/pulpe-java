/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Métier;

import java.util.Date;

/**
 *
 * @author benkiranemohamedali
 */
public class Arbitre extends Personnel{
    String  categorie; // ITT1, JAT2 ...
    String  type; //Chaise, ligne, filet
    int     nbMatch = 0;
    
    
    public Arbitre(String numPersonnel, String nomPersonnel, String prenomPersonnel, Date dateDeNaissance, String categorie, String type) {
        super(numPersonnel, nomPersonnel, prenomPersonnel, dateDeNaissance);
        this.categorie  = categorie;
        this.type       = type;
    }
    
    public void arbitrer(){
        nbMatch+= 1;
    }
    
    public boolean peutArbitrer(){
        boolean verif;
        if(this.nbMatch > 4 && this.type=="chaise"){
            verif   =   false;
        }else if (this.type =="chaise"){
            verif   =   true;
        }else{
            verif   =   false;
        }
        return verif;  
    }
    
}
