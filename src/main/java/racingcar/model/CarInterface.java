package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface CarInterface {

    int positon();

    Integer moving(Integer moving, int position);

    List<String> winner(Map<String, Integer> position);
}
