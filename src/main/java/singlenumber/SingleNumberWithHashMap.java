package singlenumber;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumberWithHashMap {

    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap();
        for(int value : nums) {

            int occurence = map.getOrDefault(value, 0);
            map.put(value, occurence + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> entrySet = map.entrySet().iterator();

        while(entrySet.hasNext()) {

            Map.Entry<Integer, Integer> entry = entrySet.next();
            if (entry.getValue()> 1) {
                continue;
            }
            return entry.getKey();
        }
        return -1;
    }
}
