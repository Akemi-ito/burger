package Composant;

import Commande.Commande;

public class HamburgerDeluxe extends Commande {

    String type;
    double prix;


    public HamburgerDeluxe(){

        this.type = "Hamburger Deluxe";
        this.prix = 15.0;

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
