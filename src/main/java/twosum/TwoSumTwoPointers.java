package twosum;

public class TwoSumTwoPointers {

    // This has O(N^2)
    public int[] twoSum(int[] nums, int target) {

        int length = nums.length;

        if (length <= 0) {
            return new int[] {};
        }

        if (length <= 1) {
            return nums;
        }

        int firstPointer = 0;
        int secondPointer = 1;

        while (firstPointer <= length - 2) {

            int firstValue = nums[firstPointer];

            int diff = target - firstValue;
            while (secondPointer <= length - 1) {

                int secondValue = nums[secondPointer];

                if (diff == secondValue) {
                    return new int[] { firstPointer, secondPointer };
                }

                secondPointer++;
            }

            firstPointer++;
            secondPointer = firstPointer + 1;
        }

        return new int[] {};
    }

}
