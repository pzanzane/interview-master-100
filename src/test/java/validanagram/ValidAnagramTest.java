package validanagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagram_test1() {

        // Assign
        final String s = "anagram";
        final String t = "nagaram";
        final boolean expected = true;

        // Act
        ValidAnagram validAnagram = new ValidAnagram();
        final boolean actual = validAnagram.isAnagram(s, t);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isAnagram_test2() {

        // Assign
        final String s = "rat";
        final String t = "car";
        final boolean expected = false;

        // Act
        ValidAnagram validAnagram = new ValidAnagram();
        final boolean actual = validAnagram.isAnagram(s, t);

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}