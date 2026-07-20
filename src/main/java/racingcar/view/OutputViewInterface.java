package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;

public interface OutputViewInterface {

     void raceOutput();

     void movingOutput(String name, int move);

     void winnerOutput(List<String> winner);
}
