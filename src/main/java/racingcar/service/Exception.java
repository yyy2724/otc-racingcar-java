package racingcar.service;

public abstract class Exception {
    static public void exception(String[] carName){
        for (String s : carName) {
            if(s.length() >= 5) {
                throw new IllegalArgumentException();
            }
        }

    }
}
