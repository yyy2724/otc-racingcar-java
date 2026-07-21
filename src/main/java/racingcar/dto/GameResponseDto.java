package racingcar.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class GameResponseDto {
    private final List<String> winner;

}
