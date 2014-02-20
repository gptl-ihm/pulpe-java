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
public class Joueur {
    String  numJoueur;
    String  nomJoueur;
    String  prenomJoueur;
    Date    dateNaissance;
    String  nationalité;
    int     classement;
    String  type;
    int     nbMatch=0;
    
//Constructeur
    public Joueur(String numJoueur, String nomJoueur, String prenomJoueur, Date dateNaissance, String nationalité, int classement, String type) {
        this.numJoueur = numJoueur;
        this.nomJoueur = nomJoueur;
        this.prenomJoueur = prenomJoueur;
        this.dateNaissance = dateNaissance;
        this.nationalité = nationalité;
        this.classement = classement;
        this.type = type;
    }
    
//Getter des attributs
    public String getNumJoueur() {
        return numJoueur;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public String getPrenomJoueur() {
        return prenomJoueur;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getNationalité() {
        return nationalité;
    }

    public int getClassement() {
        return classement;
    }

    public String getType() {
        return type;
    }

    public int getNbMatch() {
        return nbMatch;
    }
    
    

// Setter
    public void setNumJoueur(String numJoueur) {
        this.numJoueur = numJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public void setPrenomJoueur(String prenomJoueur) {
        this.prenomJoueur = prenomJoueur;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNbMatch(int nbMatch) {
        this.nbMatch = nbMatch;
    }
    
    
    public void calculeClassement(){
        
    }
    
    public void jouer(){
        nbMatch+=1;
    }
    
}
