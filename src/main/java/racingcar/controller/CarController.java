package racingcar.controller;

import racingcar.model.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarController {

    private final InputView inputView;
    private final OutputView outputView;
    private final Car car;

    public CarController(InputView inputView, OutputView outputView, Car car) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.car = car;
    }

    public void run(){
        // 이름 넣기
        String[] nameLists = inputView.setCarName();
        // 이름 검증
        inputView.check(nameLists);
        // 시도할 횟수 넣기
        int count = inputView.setCount();
        // 실행결과
        outputView.raceOutput();
        // Map 장전
        Map<String, Integer> position = new HashMap<>();
        for (String nameList : nameLists) {
            position.put(nameList, 0);
        }

        //짝대기 출력
        for(int i = 0; i < count; i++){
            for (String nameList : nameLists) {
                int move = car.positon();
                position.put(nameList, car.moving(position.get(nameList), move));
                outputView.movingOutput(nameList , move);
            }
            System.out.println();
        }

        // 승자 정하기
        List<String> winners = car.winner(position);
        // 승자 출력
        outputView.winnerOutput(winners);
    }
}
