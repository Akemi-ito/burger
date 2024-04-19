package Main.Utils;

import Commande.Commande;
import Composant.*;

public class Utils {

    public static void MenuParDelault(Commande menuParDefault){

        System.out.println("\n------Menu Par Default------\n");

        menuParDefault.Commande();

        System.out.println(menuParDefault.getHamburger().getType() + " " + menuParDefault.getHamburger().getPrix() + "€" );
        System.out.println(menuParDefault.getBoisson().getType()+ " " + menuParDefault.getBoisson().getTaille() + " " + menuParDefault.getBoisson().getPrix() + "€" );
        System.out.println(menuParDefault.getAccompagnement().getType()+ " " + menuParDefault.getAccompagnement().getPrix() + "€" );
        System.out.println("\n\n-_-_-_-PRIX TOTALE-_-_-_-\n");
        System.out.println("-_-_-_-" + menuParDefault.getPrixT() + "€-_-_-_-");

        System.out.println("\n--------------------------------------------------------------");

    }

    public static void ChoixMenu1(Commande ChoixMenu){

        System.out.println("\n------Menu Choisi 1------\n");

        Hamburger bigMac = new Hamburger("Big Mac", 6.50);
        Boisson fanta = new Boisson("Fanta", "Grand", 2.50);
        Accompagnement fritesChedar = new Accompagnement("Frites au Chedar",3.50 );
        Garniture garniture = new Garniture("Chedar","Ogion","Bacon",1,1,1.50);

        ChoixMenu.Commande(bigMac,fanta,fritesChedar,garniture);

        System.out.println(ChoixMenu.getHamburger().getType()+ " " + ChoixMenu.getHamburger().getPrix() + "€" );
        System.out.println(ChoixMenu.getBoisson().getType()+ " " + ChoixMenu.getBoisson().getTaille() + " " + ChoixMenu.getBoisson().getPrix() + "€" );
        System.out.println(ChoixMenu.getAccompagnement().getType()+ " " + ChoixMenu.getAccompagnement().getPrix() + "€" );
        System.out.println("\n__Garniture__\n");
        System.out.println(ChoixMenu.getGarniture().getGarniture1());
        System.out.println(ChoixMenu.getGarniture().getGarniture2());
        System.out.println(ChoixMenu.getGarniture().getGarniture3());
        System.out.println("\n-Prix Garniture " + ChoixMenu.getGarniture().getPrix() + "€-" );
        System.out.println("\n\n-_-_-_-PRIX TOTALE-_-_-_-\n");
        System.out.println("-_-_-_-" + ChoixMenu.getPrixT() + "€-_-_-_-");

        System.out.println("\n--------------------------------------------------------------");

    }
    public static void ChoixMenu2(Commande ChoixMenu){

        System.out.println("\n------Menu Choisi 2------\n");

        Hamburger chesseBurger = new Hamburger("Chesse Burger", 4.50);
        Boisson orangina = new Boisson("Orangina", "petit", 1.50);
        Accompagnement nuggets = new Accompagnement("8 nuggets ",5.5 );
        Garniture garniture = new Garniture("Chedar","Ogion",1,1);

        ChoixMenu.Commande(chesseBurger,orangina,nuggets,garniture);

        System.out.println(ChoixMenu.getHamburger().getType()+ " " + ChoixMenu.getHamburger().getPrix() + "€" );
        System.out.println(ChoixMenu.getBoisson().getType()+ " " + ChoixMenu.getBoisson().getTaille() + " " + ChoixMenu.getBoisson().getPrix() + "€" );
        System.out.println(ChoixMenu.getAccompagnement().getType()+ " " + ChoixMenu.getAccompagnement().getPrix() + "€" );
        System.out.println("\n__Garniture__\n");
        System.out.println(ChoixMenu.getGarniture().getGarniture1());
        System.out.println(ChoixMenu.getGarniture().getGarniture2());
        System.out.println("\n-Prix Garniture " + ChoixMenu.getGarniture().getPrix() + "€-" );
        System.out.println("\n\n-_-_-_-PRIX TOTALE-_-_-_-\n");
        System.out.println("-_-_-_-" + ChoixMenu.getPrixT() + "€-_-_-_-");

        System.out.println("\n--------------------------------------------------------------");

    }
    public static void ChoixMenu3(Commande ChoixMenu){

        System.out.println("\n------Menu Choisi 3------\n");

        Hamburger whooper = new Hamburger("Whooper", 8.50);
        Boisson fanta = new Boisson("Fanta", "Moyen", 2);
        Accompagnement café = new Accompagnement("Café",3 );
        Garniture garniture = new Garniture("Bacon",1.50);

        ChoixMenu.Commande(whooper,fanta,café,garniture);

        System.out.println(ChoixMenu.getHamburger().getType()+ " " + ChoixMenu.getHamburger().getPrix() + "€" );
        System.out.println(ChoixMenu.getBoisson().getType()+ " " + ChoixMenu.getBoisson().getTaille() + " " + ChoixMenu.getBoisson().getPrix() + "€" );
        System.out.println(ChoixMenu.getAccompagnement().getType()+ " " + ChoixMenu.getAccompagnement().getPrix() + "€" );
        System.out.println("\n__Garniture__\n");
        System.out.println(ChoixMenu.getGarniture().getGarniture1());
        System.out.println("\n-Prix Garniture " + ChoixMenu.getGarniture().getPrix() + "€-" );
        System.out.println("\n\n-_-_-_-PRIX TOTALE-_-_-_-\n");
        System.out.println("-_-_-_-" + ChoixMenu.getPrixT() + "€-_-_-_-");

        System.out.println("\n--------------------------------------------------------------");

    }
    public static void DeluxeMenu1(Commande DeluxeMenu1){

        System.out.println("\n------Menu Deluxe 2G------\n");

        HamburgerDeluxe hamburgerDeluxe = new HamburgerDeluxe();
        Boisson coca = new Boisson("Coca", "petit", 0);
        Accompagnement frites = new Accompagnement("Frites", 0 );
        Garniture garniture = new Garniture("Chedar","Bacon","","","");

        DeluxeMenu1.Commande(hamburgerDeluxe,coca,frites,garniture);

        System.out.println(DeluxeMenu1.getHamburgerDeluxe().getType() + " " + DeluxeMenu1.getHamburgerDeluxe().getPrix() + "€" );
        System.out.println(DeluxeMenu1.getBoisson().getType()+ " " + DeluxeMenu1.getBoisson().getTaille() + " " + DeluxeMenu1.getBoisson().getPrix() + "€ (Menu Deluxe)" );
        System.out.println(DeluxeMenu1.getAccompagnement().getType()+ " " + DeluxeMenu1.getAccompagnement().getPrix() + "€ (Menu Deluxe)" );
        System.out.println("\n__Garniture__\n");
        System.out.println(DeluxeMenu1.getGarniture().garnitureDeluxe1());
        System.out.println(DeluxeMenu1.getGarniture().garnitureDeluxe2());
        System.out.println("\n-Prix Garniture " + DeluxeMenu1.getGarniture().getPrix() + "€ (Menu Deluxe)-" );
        System.out.println("\n\n-_-_-_-PRIX TOTALE-_-_-_-\n");
        System.out.println("-_-_-_-" + DeluxeMenu1.getPrixT() + "€-_-_-_-");

        System.out.println("\n--------------------------------------------------------------");



    }
    public static void DeluxeMenu2(Commande DeluxeMenu2){

        System.out.println("\n------Menu Deluxe 5G------\n");

        HamburgerDeluxe hamburgerDeluxe = new HamburgerDeluxe();
        Boisson coca = new Boisson("Coca", "Grand", 0);
        Accompagnement frites = new Accompagnement("Frites", 0);
        Garniture garniture = new Garniture("Chedar","Bacon","ognion","oeuf","mozzarella");

        DeluxeMenu2.Commande(hamburgerDeluxe,coca,frites,garniture);

        System.out.println(DeluxeMenu2.getHamburgerDeluxe().getType() + " " + DeluxeMenu2.getHamburgerDeluxe().getPrix() + "€" );
        System.out.println(DeluxeMenu2.getBoisson().getType() + " " +DeluxeMenu2.getBoisson().getTaille() + " " + DeluxeMenu2.getBoisson().getPrix() + "€ (Menu Deluxe)" );
        System.out.println(DeluxeMenu2.getAccompagnement().getType() + " " + DeluxeMenu2.getAccompagnement().getPrix() + "€ (Menu Deluxe)" );
        System.out.println("\n__Garniture__\n");
        System.out.println(DeluxeMenu2.getGarniture().garnitureDeluxe1());
        System.out.println(DeluxeMenu2.getGarniture().garnitureDeluxe2());
        System.out.println(DeluxeMenu2.getGarniture().garnitureDeluxe3());
        System.out.println(DeluxeMenu2.getGarniture().garnitureDeluxe4());
        System.out.println(DeluxeMenu2.getGarniture().garnitureDeluxe5());
        System.out.println("\n-Prix Garniture " + DeluxeMenu2.getGarniture().getPrix() + "€ (Menu Deluxe)-" );
        System.out.println("\n\n-_-_-_-PRIX TOTALE-_-_-_-\n");
        System.out.println("-_-_-_-" + DeluxeMenu2.getPrixT() + "€-_-_-_-");

        System.out.println("\n--------------------------------------------------------------");


    }

}
