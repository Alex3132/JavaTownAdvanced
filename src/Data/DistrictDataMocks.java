package Data;

import Enums.Tourist;
import Models.Districts;
import Models.TownHall;

import java.util.Arrays;
import java.util.List;

public class DistrictDataMocks {


    public static List<Districts> getList(){
        return Arrays.asList(
                new Districts("S09wb","Brest Centre",Tourist.CENTER),
                new Districts("45sp9","Bellevue",Tourist.DISTRICT)
        );
    }
}
