/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package M�tier;

/**
 *
 * @author benkiranemohamedali
 */
public class Cr�neau {
    int numCr�neau;

    public Cr�neau(int numCr�neau) {
        this.numCr�neau = numCr�neau;
    }
    
    public String getHeure(){
        String  message="";
        switch(numCr�neau){
            
            case 1:
                message ="Matin (8h)";
                break;
            case 2:
                message ="Matin�e (11h)";
                break;
            case 3:
                message ="Midi (15h)";
                break;
            case 4:
                message ="Apr�s-Midi (18h)";
                break;
           
            case 5:
                message ="Soir�e (21h)";
                break;
                
            default: message ="Cr�neau indisponible";
                
        }
        return message;
    }
}
