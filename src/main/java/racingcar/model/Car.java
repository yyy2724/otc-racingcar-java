package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import racingcar.errorMessage.ErrorMessage;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Car {

    private final String name;
    private int count;


    public static Car from(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NAME_LENGTH.getMessage());
        }
        return new Car(name);
    }

    // 움직여 말아
    // 내부 변수로 넣고
    public void moving() {
        int move = Randoms.pickNumberInRange(0, 9);
        if (MoveResult.from(move) == MoveResult.GO)
            count++;
    }

    //this.count 기반으로 숫자 기반으로
    //toString 에서 그냥 짝대기 출력까지 정의한다.
    public String toString(){
        return name + " : " + "-".repeat(count);
    }




}
