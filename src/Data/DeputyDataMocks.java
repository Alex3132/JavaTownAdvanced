package Data;

import Enums.PublicFunctionsType;
import Enums.SexEnumType;
import Models.Deputy;

import java.util.Arrays;
import java.util.List;

public class DeputyDataMocks {

    public static List<Deputy> getList(){
        return Arrays.asList(
          new Deputy("AAAA aaaaa", 42, SexEnumType.FEMALE, PublicFunctionsType.FIRST_DEPUTY),
          new Deputy("BBB bbb", 32, SexEnumType.MALE, PublicFunctionsType.SPORT_DEPUTY)
        );
    }
}
