package Composant;

import Commande.Commande;

public class Boisson extends Commande {

    String type;
    String taille;
    double prix;

    public Boisson(String type, String taille, double prix) {
        this.type = type;
        this.taille = taille;
        this.prix = prix;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
