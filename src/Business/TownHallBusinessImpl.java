package Business;

import Data.TownHallDataMocks;
import Models.TownHall;

import java.util.List;

public class TownHallBusinessImpl implements TownHallBusiness{
    List<TownHall> townHall = TownHallDataMocks.getList();

    public List<TownHall> getList(){
        return townHall;
    }

}
