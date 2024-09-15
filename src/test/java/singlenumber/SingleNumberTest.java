package singlenumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void singleNumber_test1() {

        // Assign
        int[] nums = {2,2,1};
        SingleNumber singleNumber = new SingleNumber();
        int expected = 1;

        // Act
        int actual = singleNumber.singleNumber(nums);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void singleNumber_test2() {

        // Assign
        int[] nums = {4,1,2,1,2};
        SingleNumber singleNumber = new SingleNumber();
        int expected = 4;

        // Act
        int actual = singleNumber.singleNumber(nums);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void singleNumber_test3() {

        // Assign
        int[] nums = {1};
        SingleNumber singleNumber = new SingleNumber();
        int expected = 1;

        // Act
        int actual = singleNumber.singleNumber(nums);

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}