package racingcar.service;

import java.util.HashMap;

public interface CarLetGoService {

     String[] getCarName();
     HashMap<String, Integer> getRunCount();

    void letgo();
    String moveCount(String carName,int value);
}
