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
public class Créneau {
    int numCréneau;

    public Créneau(int numCréneau) {
        this.numCréneau = numCréneau;
    }
    
    public String getHeure(){
        String  message="";
        switch(numCréneau){
            
            case 1:
                message ="Matin (8h)";
                break;
            case 2:
                message ="Matinée (11h)";
                break;
            case 3:
                message ="Midi (15h)";
                break;
            case 4:
                message ="Après-Midi (18h)";
                break;
           
            case 5:
                message ="Soirée (21h)";
                break;
                
            default: message ="Créneau indisponible";
                
        }
        return message;
    }
}
