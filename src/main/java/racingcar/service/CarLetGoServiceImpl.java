package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;

@Getter
@RequiredArgsConstructor
public class CarLetGoServiceImpl implements CarLetGoService {

    private final String[] carName;
    private final int count;
    private final HashMap<String, Integer> runCount;



    @Override
    public void letgo(){
        //이름 잘못 입력했을시 예외처리
        Exception.exception(carName);
        System.out.println("실행결과");
        for (int i = 0; i < count; i++){
            for (String carName : carName){
                System.out.println(carName + " : " + moveCount(carName, Randoms.pickNumberInRange(0, 9)));
            }
            System.out.println(); // 줄바꿈
        }

    }

    //짝대기 나오도록
    //작대기 4개 이상이면 카운트 올라가도록
    @Override
    public String moveCount(String carName,int value){
        if(value >= 4){
            // 4개 이상이면 앞으로 한칸
            runCount.put(carName,runCount.get(carName) + 1);
        }
        // 인텔리제이가 리팩토링 해줌, repeat 반복하는듯
        return "-".repeat(value);
    }
}
