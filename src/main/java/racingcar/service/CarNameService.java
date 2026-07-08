package racingcar.service;

import java.util.HashMap;

public interface CarNameService {

    void carNameSet();

    String[] getCarName();
    HashMap<String, Integer> getRunCount();
}
