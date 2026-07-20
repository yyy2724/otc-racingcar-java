package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.errorMessage.ErrorMessage;

import java.util.ArrayList;
import java.util.List;

public class InputView implements InputViewInterface{

    @Override
    public String[] setCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.");

        return Console.readLine().split(",");

    }

    @Override
    public int setCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COUNT.getMessage());
        }

    }

    @Override
    public void check(String[] carLists){
        for (String carList : carLists) {
            if(carList.length() > 4){
                throw new IllegalArgumentException(ErrorMessage.INVALID_NAME_LENGTH.getMessage());
            }
        }
    }

}
