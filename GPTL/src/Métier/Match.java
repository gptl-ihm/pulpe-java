/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package M�tier;

import java.util.Date;

/**
 *
 * @author benkiranemohamedali
 */
public class Match {
   String   numMatch;
   Date     dateMatch;
   
//Constructeur
    public Match(String numMatch, Date dateMatch) {
        this.numMatch = numMatch;
        this.dateMatch = dateMatch;
    }
   
    
//Setter des attributs
    public void setNumMatch(String numMatch) {
        this.numMatch = numMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }

//Getter des attributs
    public String getNumMatch() {
        return numMatch;
    }

    public Date getDateMatch() {
        return dateMatch;
    }
   
/**
 * 
 * @param j1
 * @param j2 
 * @param dt 
 * @param cr�neau 
 * 
 */
    public void jouer(Joueur j1, Joueur j2, Date dt, Cr�neau cr�neau){
        
    }
}
