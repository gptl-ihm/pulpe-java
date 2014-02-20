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
public class Equipe {
    String  numEquipe;
    Joueur  joueur1;
    Joueur  joueur2;

//Constructeur
    public Equipe(String numEquipe, Joueur joueur1, Joueur joueur2) {
        this.numEquipe = numEquipe;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }
    
//Getter des attributs
    public String getNumEquipe() {
        return numEquipe;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }
    
//Setter des attributs
    public void setNumEquipe(String numEquipe) {
        this.numEquipe = numEquipe;
    }

    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

//Override TOSTRING
    @Override
    public String toString() {
        return "Equipe{" + "numEquipe=" + numEquipe + ", joueur1=" + joueur1 + ", joueur2=" + joueur2 + '}';
    }
    
    
    
}
