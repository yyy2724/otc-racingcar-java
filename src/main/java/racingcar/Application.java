package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.car.Car;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        //차이름 ,로 구분
        String carNamePackage = Console.readLine();
        System.out.println("시도할 회수는 몇회인가요?");
        //횟수로
        int Count = Integer.parseInt(Console.readLine());

        Car car = new Car(carNamePackage, Count);

        // 실행!
        car.letgo();

        // 우승자 출력
        car.winner();
    }
}
