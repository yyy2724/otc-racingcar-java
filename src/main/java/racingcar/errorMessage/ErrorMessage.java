package racingcar.errorMessage;

import lombok.Getter;

@Getter
public enum ErrorMessage {
    INVALID_COUNT("반복 횟수는 숫자로 넣어주세요."),
    INVALID_NAME_LENGTH("차 이름은 4글자 이하로 지어주세요.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

}
