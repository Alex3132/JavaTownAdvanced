import Business.TownBusinessImpl;
import Models.Town;
import helper.Helper;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        TownBusinessImpl townBusiness = new TownBusinessImpl();
        Optional<Town> town = townBusiness.get("Agt78u");

       // Helper.generateJson(town);

        System.out.println(town.toString());
    }
}
