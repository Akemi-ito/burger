package Commande;

import Composant.*;

public class Commande {

    private Hamburger hamburger;
    private HamburgerDeluxe hamburgerDeluxe;
    private Boisson boisson;
    private Accompagnement accompagnement;
    private Garniture garniture;
    private double prixT;




    public void Commande(){

        this.hamburger = new Hamburger("Burger Classic",5.50);
        this.boisson = new Boisson("Coca","moyen",2);
        this.accompagnement = new Accompagnement("frites",3);
        this.prixT = this.hamburger.getPrix() + this.boisson.getPrix() + this.accompagnement.getPrix();

    }

    public void Commande(Hamburger hamburger, Boisson boisson, Accompagnement accompagnement, Garniture garniture){

        this.hamburger = hamburger;
        this.boisson = boisson;
        this.accompagnement = accompagnement;
        this.garniture = garniture;

        this.prixT = this.hamburger.getPrix() + this.boisson.getPrix() + this.accompagnement.getPrix() + this.garniture.getPrix();

    }

    public void Commande(HamburgerDeluxe hamburgerDeluxe, Boisson boisson, Accompagnement accompagnement, Garniture garniture){

        this.hamburgerDeluxe = hamburgerDeluxe;
        this.boisson = boisson;
        this.accompagnement = accompagnement;
        this.garniture = garniture;

        this.prixT = this.hamburgerDeluxe.getPrix();

    }



    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public Boisson getBoisson() {
        return boisson;
    }

    public void setBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    public Accompagnement getAccompagnement() {
        return accompagnement;
    }

    public void setAccompagnement(Accompagnement accompagnement) {
        this.accompagnement = accompagnement;
    }

    public Garniture getGarniture() {
        return garniture;
    }

    public void setGarniture(Garniture garniture) {
        this.garniture = garniture;
    }

    public HamburgerDeluxe getHamburgerDeluxe() {
        return hamburgerDeluxe;
    }

    public void setHamburgerDeluxe(HamburgerDeluxe hamburgerDeluxe) {
        this.hamburgerDeluxe = hamburgerDeluxe;
    }

    public double getPrixT() {
        return prixT;
    }

    public void setPrixT(double prixT) {
        this.prixT = prixT;
    }
}
