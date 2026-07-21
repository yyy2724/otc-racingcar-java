package racingcar.model;

import lombok.Getter;
import racingcar.dto.GameRequestDto;
import racingcar.dto.GameResponseDto;

import java.util.List;

@Getter
public class CarGameService {

    private final List<Car> cars;
    private final int round;      // 초기화 할때 넣어주기

    public CarGameService(GameRequestDto dto) {
        this.cars = dto.getNames().stream()
                .map(Car::from)
                .toList();
        this.round = dto.getCount();
    }

    //차 별로 이동 카운트
    public GameResponseDto play() {
        for (int i = 0; i < this.round; i++) {
            eachRoundPlay();
            System.out.println(this);
        }

        return new GameResponseDto(GameResponseDto.winners(cars));

    }

    private void eachRoundPlay(){
        for (Car car : cars) {
            car.moving();
        }

    }

    // 여기서도 ToString 만들어서
    // for loop 돌면서 각각 car의 toString을 반환
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (Car car : cars) {
            //입력
            string.append(car.toString()).append("\n");
        }
        return string.toString();
    }


}
