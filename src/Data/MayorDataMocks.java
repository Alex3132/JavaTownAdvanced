package Data;

import Enums.PublicFunctionsType;
import Enums.SexEnumType;
import Models.Mayor;

public class MayorDataMocks {

    public static Mayor getMayor(){
        Mayor mayor = new Mayor();
        mayor.setAge(43);
        mayor.setJob(PublicFunctionsType.MAYOR);
        mayor.setName("François Cuillandre");
        mayor.setSex(SexEnumType.MALE);

        return mayor;
    }
}
