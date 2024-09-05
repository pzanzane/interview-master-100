package validpalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome_test1() {

        // Assign
        String str = "A man, a plan, a canal: Panama";
        boolean expected = true;
        ValidPalindrome validPalindrome = new ValidPalindrome();

        // Act
        boolean actual = validPalindrome.isPalindrome(str);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isPalindrome_test2() {

        // Assign
        String str = "race a car";
        boolean expected = false;
        ValidPalindrome validPalindrome = new ValidPalindrome();

        // Act
        boolean actual = validPalindrome.isPalindrome(str);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isPalindrome_test3() {

        // Assign
        String str = " ";
        boolean expected = false;
        ValidPalindrome validPalindrome = new ValidPalindrome();

        // Act
        boolean actual = validPalindrome.isPalindrome(str);

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}