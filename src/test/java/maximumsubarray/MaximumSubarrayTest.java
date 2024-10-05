package maximumsubarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void maxSubArray_test1() {

        // Assign
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray arr = new MaximumSubarray();
        int expected = 6;

        // Act
        int actual = arr.maxSubArray(nums);

        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void maxSubArray_test2() {

        // Assign
        int[] nums = {1};
        MaximumSubarray arr = new MaximumSubarray();
        int expected = 1;

        // Act
        int actual = arr.maxSubArray(nums);

        // Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void maxSubArray_test3() {

        // Assign
        int[] nums = {5,4,-1,7,8};
        MaximumSubarray arr = new MaximumSubarray();
        int expected = 23;

        // Act
        int actual = arr.maxSubArray(nums);

        // Assert
        Assertions.assertEquals(expected, actual);

    }
}