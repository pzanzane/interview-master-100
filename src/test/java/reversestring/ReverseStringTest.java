package reversestring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString_test1() {

        // Assign
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        ReverseString reverseString = new ReverseString();
        char[] expected = {'o', 'l', 'l', 'e', 'h'};

        // Act
        reverseString.reverseString(s);

        // Assert
        Assertions.assertArrayEquals(expected, s);
    }
}