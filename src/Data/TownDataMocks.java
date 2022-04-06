package Data;

import Models.Town;

import java.util.Arrays;
import java.util.List;

public class TownDataMocks {

    static Town getTown() {
        Town brest = new Town();
        brest.setId("Agt78u");
        brest.setName("Brest");
        brest.setDistricts(DistrictDataMocks.getList());
        brest.setTownHall(TownHallDataMocks.getList());
        brest.setStat(StatisticsDataMocks.getStats());
        brest.setInhabitant(InhabitantsDataMocks.getInhabitants());

        return brest;
    }

    public static List<Town> getList() {
        return Arrays.asList(
                getTown()
        );
    }
}
