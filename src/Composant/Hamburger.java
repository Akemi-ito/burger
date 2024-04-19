package Composant;

import Commande.Commande;

public class Hamburger extends Commande {

    String type;
    double prix;


    public Hamburger(String type, double prix) {
        this.type = type;
        this.prix = prix;
    }





    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

}

