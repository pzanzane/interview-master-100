package twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMap {

    public int[] twoSum(int[] nums, int target) {

        int length = nums.length;

        if (length <= 0) {
            return new int[] {};
        }

        if (length <= 1) {
            return nums;
        }

        Map<Integer, Integer> hashMap = new HashMap();
        int index = 0;
        for(int num: nums) {

            int diff = target - num;

            if (hashMap.containsKey(diff)) {
                return new int[] { hashMap.get(diff), index };
            }
            hashMap.put(num, index);
            index ++;
        }

        return new int[] {};
    }
}
