package Data;

import Models.TownHall;

import java.util.Arrays;
import java.util.List;

public class TownHallDataMocks {

    public static List<TownHall> getList(){
        return Arrays.asList(
                new TownHall("Mairie de Brest",MayorDataMocks.getMayor(),DeputyDataMocks.getList())
        );
    }
}
