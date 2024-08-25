package twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumMapTest {

    @Test
    void twoSum_test1() {
        // Assign
        int[] twoSum = { 2,7,11,15 };
        int target = 9;
        int[] expected = {0,1};

        // Act
        TwoSumMap twosum = new TwoSumMap();
        int[] result = twosum.twoSum(twoSum, target);

        // Assert
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void twoSum_test2() {
        // Assign
        int[] twoSum = { 3,2,4 };
        int target = 6;
        int[] expected = {1,2};

        // Act
        TwoSumMap twosum = new TwoSumMap();
        int[] result = twosum.twoSum(twoSum, target);

        // Assert
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void twoSum_test3() {
        // Assign
        int[] twoSum = { -2,7,11,-7 };
        int target = -9;
        int[] expected = {0,3};

        // Act
        TwoSumMap twosum = new TwoSumMap();
        int[] result = twosum.twoSum(twoSum, target);

        // Assert
        Assertions.assertArrayEquals(expected, result);
    }
}