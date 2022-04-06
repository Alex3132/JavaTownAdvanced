package Data;

import Models.Statistics;
import Models.TownHall;

import java.util.Arrays;
import java.util.List;

public class StatisticsDataMocks {


    public static List<Statistics> getStats(){
        return Arrays.asList(
                new Statistics(134750,29000)
        );
    }
}
