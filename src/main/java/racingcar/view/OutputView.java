package racingcar.view;

import racingcar.model.Car;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OutputView{

    // 단순 실행 결과만 나오게.. 하핳
    public void raceOutput(){
        System.out.println("\n실행결과");
    }

    //승자 출력
    public void winnerOutput(List<String> winner){
        String a = "최종 우승자 : ";
        a = a + winner.stream()
                .collect(Collectors.joining(", "));

        System.out.println(a);

    }

    // 짝대기 출력
//    public void movingOutput(String name, int count) {
//        System.out.println(name + " : " + "-".repeat(count));
//    }

    // 빈칸출력
    public void printBlankLine(){
        System.out.println();
    }


}
