package maximumsubarray;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = Integer.MIN_VALUE;

        for (int value : nums) {

            if (curr_sum < 0) {

                curr_sum = value;

            } else {

                curr_sum = curr_sum + value;

            }

            max_sum = Math.max(max_sum, curr_sum);

        }

        return max_sum;
    }
}
