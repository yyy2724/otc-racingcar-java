package racingcar;

import racingcar.controller.CarController;
import racingcar.model.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        CarController carController = new CarController(new InputView(), new OutputView(), new Car());
        carController.run();

    }
}
