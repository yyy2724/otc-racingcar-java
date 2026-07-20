package racingcar.model;

public enum MoveResult {
    GO, STOP;

    public static MoveResult from(int num){
        return num >= 4 ? GO : STOP;
    }

}
