/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author CHAIMA
 */
public class Voiture {
    public int id;
    public String marque;
    public String couleur;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Voiture:{"+"Id: "+id+", Marque: "+marque+", Couleur:"+couleur+" }"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
       int hash = 7;
        hash = 11 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public Voiture() {
    }

    public Voiture(int id, String marque, String couleur) {
        this.id = id;
        this.marque = marque;
        this.couleur = couleur;
    }
    
    public Voiture(String marque, String couleur) {
       
        this.marque = marque;
        this.couleur = couleur;
    }
    
}
