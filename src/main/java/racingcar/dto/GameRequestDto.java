package racingcar.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import racingcar.model.Car;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class GameRequestDto {
    private final List<String> names;
    private final int count;

}
