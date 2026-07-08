package racingcar.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@Getter
@RequiredArgsConstructor
public class CarNameServiceImpl implements CarNameService {

    private final String carNamePackage;
    private String[] carName;
    private HashMap<String, Integer> runCount = new HashMap<String, Integer>();


    @Override
    public void carNameSet() {
        carName = carNamePackage.split(",");
        for(String carName : carName){
            this.runCount.put(carName, 0);
        }
    }
}
