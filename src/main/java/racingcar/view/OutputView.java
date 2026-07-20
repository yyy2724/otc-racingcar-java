package racingcar.view;

import racingcar.model.Car;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OutputView implements OutputViewInterface{

    // 단순 실행 결과만 나오게.. 하핳
    @Override
    public void raceOutput(){
        System.out.println("실행결과");
    }

    // 짝대기 출력
    @Override
    public void movingOutput(String name, int move){
        System.out.println(name + " : " + "-".repeat(move));
    }

    //승자 출력
    @Override
    public void winnerOutput(List<String> winner){
        String a = "최종 우승자 : ";
        a = a + winner.stream()
                .collect(Collectors.joining(", "));

        System.out.println(a);

    }


}
