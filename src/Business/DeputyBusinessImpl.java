package Business;

import Data.DeputyDataMocks;
import Models.Deputy;

import java.util.List;

public class DeputyBusinessImpl implements DeputyBusiness {

    List<Deputy> persons = DeputyDataMocks.getList();

    public List<Deputy> getPersons() {
        return persons;
    }
}
