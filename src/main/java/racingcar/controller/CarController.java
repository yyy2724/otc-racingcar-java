package racingcar.controller;

import racingcar.dto.GameRequestDto;
import racingcar.model.Car;
import racingcar.model.CarGameService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarController {


    private final InputView inputView;              //1. 유저로부터 입력을 받는다.

    private final OutputView outputView;            //3. 결과를 출력한다.


    public CarController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {

        // 이름 넣기
        // 시도할 횟수 넣기
        GameRequestDto gameRequestDto = inputView.setGameRequest();

        // "실행결과" 글자 출력
        outputView.raceOutput();

        //객체 생성
        CarGameService carGameService = new CarGameService(gameRequestDto); // 생성자로 강제 완료!

        //작대기 및 승자 출력
        outputView.winnerOutput(carGameService.play()); // 이거 이렇게 쓰지 않기 두줄로 찢기


    }


}


