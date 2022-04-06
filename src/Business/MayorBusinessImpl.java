package Business;

import Data.DeputyDataMocks;

import Data.MayorDataMocks;
import Models.Mayor;

import java.util.List;

public class MayorBusinessImpl implements MayorBusiness {
    Mayor mayor = MayorDataMocks.getMayor();

    public Mayor getMayor() {
        return mayor;
    }
}
