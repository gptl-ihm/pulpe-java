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
public abstract class Personnel {
    String  numPersonnel;
    String  nomPersonnel;
    String  prenomPersonnel;
    Date    dateDeNaissance;

//Constructeur
    public Personnel(String numPersonnel, String nomPersonnel, String prenomPersonnel, Date dateDeNaissance) {
        this.numPersonnel = numPersonnel;
        this.nomPersonnel = nomPersonnel;
        this.prenomPersonnel = prenomPersonnel;
        this.dateDeNaissance = dateDeNaissance;
    }
    
//Getters des attributs
    public String getNumPersonnel() {
        return numPersonnel;
    }

    public String getNomPersonnel() {
        return nomPersonnel;
    }

    public String getPrenomPersonnel() {
        return prenomPersonnel;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    
// Setter des attributs
    public void setNumPersonnel(String numPersonnel) {
        this.numPersonnel = numPersonnel;
    }

    public void setNomPersonnel(String nomPersonnel) {
        this.nomPersonnel = nomPersonnel;
    }

    public void setPrenomPersonnel(String prenomPersonnel) {
        this.prenomPersonnel = prenomPersonnel;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

//Methode toString
    @Override
    public String toString() {
        return "Personnel{" + "numPersonnel=" + numPersonnel + ", nomPersonnel=" + nomPersonnel + ", prenomPersonnel=" + prenomPersonnel + ", dateDeNaissance=" + dateDeNaissance + '}';
    }
    
}

