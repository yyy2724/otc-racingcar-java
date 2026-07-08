package racingcar.car;

import camp.nextstep.edu.missionutils.Randoms;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class Car {

    private String carNamePackage;
    private String[] carName;
    private int count;
    private HashMap<String, Integer> runCount = new HashMap<String, Integer>();


    public Car(String carNamePackage, int count) {
        this.carNamePackage = carNamePackage;
        this.carName = carNamePackage.split(",");
        this.count = count;
        for(String carName : carName){
            this.runCount.put(carName, 0);
        }
    }

    //실행 결과 및
    public void letgo(){
        //이름 잘못 입력했을시 예외처리
        exception(carName);
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
    public String moveCount(String carName,int value){
        if(value >= 4){
            // 4개 이상이면 앞으로 한칸
            runCount.put(carName,runCount.get(carName) + 1);
        }
        // 인텔리제이가 리팩토링 해줌, repeat 반복하는듯
        return "-".repeat(value);
    }

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

    public void exception(String[] carName){
        throw new IllegalArgumentException();
    }

}
