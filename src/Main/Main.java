package Main;

import Commande.Commande;
import Main.Utils.Utils;

public class Main {
    public static void main(String[] args) {

        Commande menuParDefault = new Commande();
        Commande choixMenu1 = new Commande();
        Commande choixMenu2 = new Commande();
        Commande choixMenu3 = new Commande();
        Commande deluxeMenuG2 = new Commande();
        Commande deluxeMenuG5 = new Commande();

        Utils.MenuParDelault(menuParDefault);
        Utils.ChoixMenu1(choixMenu1);
        Utils.ChoixMenu2(choixMenu2);
        Utils.ChoixMenu3(choixMenu3);
        Utils.DeluxeMenu1(deluxeMenuG2);
        Utils.DeluxeMenu2(deluxeMenuG5);


    }
}