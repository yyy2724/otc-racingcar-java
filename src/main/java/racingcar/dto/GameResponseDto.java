package racingcar.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import racingcar.model.Car;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class GameResponseDto {
    private final List<String> winner;


    public static List<String> winners(List<Car> cars){
        int maxScore = cars.stream()
                .mapToInt(Car::getCount)
                .max()
                .orElse(0);

        return cars.stream()    // GameResponseDto 를 출력
                .filter(car -> car.getCount() == maxScore)
                .map(Car::getName)
                .toList();
    }

}
