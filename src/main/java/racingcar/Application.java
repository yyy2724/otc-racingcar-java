package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.service.*;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        //차이름 ,로 구분
        CarNameService carNameService = new CarNameServiceImpl(Console.readLine());
        // 차 이름 함수 돌리기
        carNameService.carNameSet();

        System.out.println("시도할 회수는 몇회인가요?");

        //실행 횟수
        int count = Integer.parseInt(Console.readLine());

        //실행
        CarLetGoService carLetGoService = new CarLetGoServiceImpl(carNameService.getCarName(), count, carNameService.getRunCount());
        carLetGoService.letgo();

        //승자는?
        WinnerService winnerService = new WinnerServiceImpl(carLetGoService.getCarName(), carLetGoService.getRunCount());
        winnerService.winner();

    }
}
