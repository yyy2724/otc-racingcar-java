package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Car implements CarInterface{

    private int position;

    // 몇칸이야
    @Override
    public int positon(){
        return Randoms.pickNumberInRange(0, 9);
    }

    // 움직여 말아
    @Override
    public Integer moving(Integer moving, int position){

        return  MoveResult.from(position) == MoveResult.GO ? ++moving : moving;
    }

    //승자 정하기
    @Override
    public List<String> winner(Map<String, Integer> position){
        int max = Collections.max(position.values());
        List<String> lists =  position.entrySet().stream()
                .filter(list -> list.getValue() == max)
                .map(Map.Entry :: getKey)
                .toList();

        return lists;
    }



}
