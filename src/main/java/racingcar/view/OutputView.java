package racingcar.view;

import racingcar.dto.GameResponseDto;
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
    public void winnerOutput(GameResponseDto dto){
        String a = "최종 우승자 : ";
        a = a + dto.getWinner().stream()
                .collect(Collectors.joining(", "));

        System.out.println(a);

    }



}
