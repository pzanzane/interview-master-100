package MissingNumber;

public class MissingNumberXOR {

    public int missingNumber(int[] nums) {

        int result = nums.length;

        for (int index = 0; index < nums.length; index ++) {

            result ^= index^nums[index];
        }

        return result;
    }
}
