package challenges.leftJoin;

import challenges.hashtable.Hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {
    public static List<String> leftJoin(HashMap hm1, HashMap hm2){
        List<String> list = new ArrayList<>();
        for (Object key : hm1.keySet()){
            if (hm1.containsKey(key)){
                list.add(key + ": " + hm1.get(key) + ", " + hm2.get(key));
            } else {
                list.add(key + ": " + hm1.get(key) + ", " + null);
            }
        }
        return list;
    }
}
