/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MÈtier;

import java.io.*;
import java.util.*;


public class Conteneur <K extends Comparable <K>, V extends Serializable> implements Serializable, Cloneable{
    
    private TreeMap<K, V> tM;
    private K cleCourante;
   
    //-----    Constructeurs  ----------------------------
    public Conteneur(TreeMap<K, V> t) {
        tM          = t;
        cleCourante = null;
    }
    
    public Conteneur (){
        tM          = null;
        cleCourante = null;
    }
   
    //-----    Methodes ----------------------------
    public boolean ajouter(K cle, V valeur){
        if(tM.containsKey(cle)){
            return false;
        }
        else{
            tM.put(cle, valeur);
            cleCourante=cle;
            return true;
        } 
    }
    
    public K cleCourante(){
        return cleCourante;
    }
    
    public K cleMax(){
        return tM.lastKey();
        
    }
    
    public K cleMin(){
        return tM.firstKey();
    }
    
    //Renvoie la cl» de l'»l»ment pr»cedent dans l'ordre des cl»s
    public K clePrecedente(){
        cleCourante = tM.lowerKey(cleCourante);
        return cleCourante;
    }
    
    //Renvoie la cl» de l'»l»ment suivant dans l'ordre des cl»s
    public K cleSuivante(){
        cleCourante=tM.higherKey(cleCourante);
        return cleCourante;
    }
    
    //Positionne sur la derniere cl»
    public void dernier(){
        cleCourante = tM.lastKey();
    }
    
    //Indique si le conteneur est vide
    public boolean estVide(){
        if(tM.isEmpty()){
            return true;
        }
           return false; 
    }
    
    //Indique si la cl» existe dans le conteneur
    public boolean existe(K cle){
        if(tM.containsKey(cle)){
            return true;
        }
        return false;
    }
    
    //Renvoie le nombre d'objets pr»sents dans le conteneur
    public int nbElements(){
        return tM.size();
    }
    
    //Renvoie l'objet de cl» K dans le conteneur ou bien null
    public V obtenir(K cle){
        if(!tM.isEmpty()){
            return tM.get(cle);   
        }
        return null;
    }
    
    //Positionnement sur la cl» si elle existe
    public boolean positionner(K cle){
        if(!tM.containsKey(cle)){
            return false;
        }
        cleCourante = cle;
        return true;
    }
    
    //Positionnement sur l'»l»ment pr»cedent dans l'ordre des cl»s
    public void precedent(){
        K cle = tM.lowerKey(cleCourante);
        if(cle != null){
            cleCourante = cle;
        }
    }
   
    //Positionnement sur le premier »l»ment du conteneur
    public void premier(){
        cleCourante = tM.firstKey();
    }
    
    //Supprime du conteneur l'»l»ment á partir de la cl» si elle existe
    public boolean supprimer(K cle){
        if(tM.isEmpty()){
            cleCourante=null;
            return false;
        }
        if(!tM.containsKey(cle)){
            return false;
        }
        if(cle.compareTo(tM.lastKey()) == 0){
           precedent();
        } else {
           suivant();
        }
        tM.remove(cle);
        return true;
    }
    
    //Positionnement sur l'»l»ment suivant dans l'ordre des cl»s
    public void suivant(){
        K cle = tM.higherKey(cleCourante);
        if(cle != null){
            cleCourante = cle;
        }
    }
    
    //Vide le contenu du conteneur
    public void vider(){
        tM.clear();
    }
    
    //serialisation dans un fichier f1
    public void sauvegarder(String nomFic)throws Exception{
        File f1=new File(nomFic); // declaration du fichier
        FileOutputStream fs= new FileOutputStream(f1);
        ObjectOutputStream fsObj = new ObjectOutputStream(fs);
        fsObj.writeObject(tM);  // ecriture du conteneur
        fsObj.close(); //on ferme le flot
    }
    
    //suppression des warnings
    @SuppressWarnings("unchecked")
    //D»s»rialisation - le type V doit Õtre serialisable
    public void charger(String nomFic) throws Exception{
        File f1=new File(nomFic);
        FileInputStream fe = new FileInputStream(f1);
        ObjectInputStream feObj = new ObjectInputStream(fe);
        tM=(TreeMap<K, V>) feObj.readObject();
        feObj.close(); // on ferme le flot
        if(!tM.isEmpty()) // S'il y a des »l»ments alors, index = 0
        {
            cleCourante =  tM.firstKey();
        }
        
    }
    
}