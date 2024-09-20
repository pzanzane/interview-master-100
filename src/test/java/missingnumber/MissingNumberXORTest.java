package missingnumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MissingNumberXORTest {

    @Test
    void missingNumber_test1() {

        // Assign
        MissingNumberXOR missingNumberWithMap = new MissingNumberXOR();
        int[] input = {3,0,1};
        int expected = 2;

        // Act
        int actual = missingNumberWithMap.missingNumber(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void missingNumber_test2() {

        // Assign
        MissingNumberXOR missingNumberWithMap = new MissingNumberXOR();
        int[] input = {0,1};
        int expected = 2;

        // Act
        int actual = missingNumberWithMap.missingNumber(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void missingNumber_test3() {

        // Assign
        MissingNumberXOR missingNumberWithMap = new MissingNumberXOR();
        int[] input = {9,6,4,2,3,5,7,0,1};
        int expected = 8;

        // Act
        int actual = missingNumberWithMap.missingNumber(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void missingNumber_test4() {

        // Assign
        MissingNumberXOR missingNumberWithMap = new MissingNumberXOR();
        int[] input = {3,0,1};
        int expected = 0;

        // Act
        int actual = missingNumberWithMap.missingNumber(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}