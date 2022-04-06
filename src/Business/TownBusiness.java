package Business;

import Models.Town;

import java.util.List;
import java.util.Optional;

public interface TownBusiness {

    /**
     *
     * @param id
     * @return
     */

    Optional<Town> get(String id);

    /**
     *
     * @return
     */
    List<Town> getList();

}
