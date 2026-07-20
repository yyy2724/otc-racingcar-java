package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.errorMessage.ErrorMessage;

public interface InputViewInterface {
     String[] setCarName();

     int setCount();

     void check(String[] carLists);
}
