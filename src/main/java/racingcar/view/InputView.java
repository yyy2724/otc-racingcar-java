package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.dto.GameRequestDto;
import racingcar.errorMessage.ErrorMessage;
import racingcar.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView{

    private List<String> setCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요.");

        return Arrays.stream(Console.readLine().split(","))
                .map(String::trim)
                .collect(Collectors.toList());

    }

    private int setCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COUNT.getMessage());
        }

    }

    // 위에 private 을 묶어서 안에서 사용
    public GameRequestDto setGameRequest(){
        return new GameRequestDto(setCarName(), setCount());
    }



}
