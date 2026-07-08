package racingcar.service;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@RequiredArgsConstructor
public class WinnerServiceImpl implements WinnerService {

    private final String[] carName;
    private final HashMap<String, Integer> runCount;

    //최종 우승자 출력
    public void winner(){
        int max = 0;
        // 최대 값 구하기
        for (String carName : carName){
            if (runCount.get(carName) > max){
                max = runCount.get(carName);
            }
        }

        String winner = "";
        //우승자 출력하기
        for (String carName : carName){
            if(runCount.get(carName) == max){
                winner = winner + carName + ", ";
            }
        }

        // 마지막 쉼표 자르기
        winner = winner.substring(0, winner.length() - 2);
        System.out.println("최종 우승자 : " + winner);
    }

}
