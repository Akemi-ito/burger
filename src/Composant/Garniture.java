package Composant;

import Commande.Commande;

public class Garniture extends Commande {

    String type;
    double prix;
    String[] garniture = new String[3];
    String[] garnitureDeluxe = new String[5];


    public Garniture(String garniture, double prix){

        this.garniture[0] = garniture;
        this.prix = prix;

    }

    public Garniture(String garniture1, String garniture2, double prixG1, double prixG2){

        double prixT;

        garniture[0] = garniture1;
        garniture[1] = garniture2;

        prixT = prixG1 + prixG2;

        this.prix = prixT;


    }
    public Garniture(String garniture1, String garniture2 , String garniture3, double prixG1, double prixG2, double prixG3){

        double prixT;

        garniture[0] = garniture1;
        garniture[1] = garniture2;
        garniture[2] = garniture3;

        prixT = prixG1 + prixG2 + prixG3;
        this.prix = prixT;

    }
    public Garniture(String garniture1, String garniture2 , String garniture3, String garniture4, String garniture5){

        garnitureDeluxe[0] = garniture1;
        garnitureDeluxe[1] = garniture2;
        garnitureDeluxe[2] = garniture3;
        garnitureDeluxe[3] = garniture4;
        garnitureDeluxe[4] = garniture5;

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

    public String getGarniture1() {
        return garniture[0];
    }

    public String getGarniture2() {
        return garniture[1];
    }
    public String getGarniture3() {
        return garniture[2];
    }


    public void setGarniture(String[] garniture) {
        this.garniture = garniture;
    }

    public String garnitureDeluxe1() {
        return garnitureDeluxe[0];
    }
    public String garnitureDeluxe2() {
        return garnitureDeluxe[1];
    }
    public String garnitureDeluxe3() {
        return garnitureDeluxe[2];
    }
    public String garnitureDeluxe4() {
        return garnitureDeluxe[3];
    }
    public String garnitureDeluxe5() {
        return garnitureDeluxe[4];
    }


}
