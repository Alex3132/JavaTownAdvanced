package Business;

import Data.TownDataMocks;
import Models.Town;

import java.util.List;
import java.util.Objects;
import java.util.Optional;



public class TownBusinessImpl implements TownBusiness {


    List<Town> town = TownDataMocks.getList();

    @Override
    public Optional<Town> get(String id) {
        return town.stream()
                .filter(town -> Objects.equals(town.getId(), id))
                .findFirst();
    }

    @Override
    public List<Town> getList() {
        return town;
    }
}
