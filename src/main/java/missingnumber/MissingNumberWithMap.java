package missingnumber;

import java.util.HashMap;
import java.util.Map;

public class MissingNumberWithMap {

    public int missingNumber(int[] nums) {

        final Map<Integer, Integer> map = new HashMap();
        for(int num: nums) {
            map.put(num, 0);
        }

        for (int index = 0; index <= nums.length; index ++) {

            if (!map.containsKey(index)) {
                return index;
            }
        }

        return -1;
    }
}
