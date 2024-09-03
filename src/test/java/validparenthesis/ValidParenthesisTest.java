package validparenthesis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    @Test
    void isValid_test1() {

        // Assign
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String parenthesis = "()";
        boolean expectedResult = true;

        // Act
        boolean isValid = validParenthesis.isValid(parenthesis);

        // Assert
        Assertions.assertEquals(expectedResult, isValid);
    }

    @Test
    void isValid_test2() {

        // Assign
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String parenthesis = "()[]{}";
        boolean expectedResult = true;

        // Act
        boolean isValid = validParenthesis.isValid(parenthesis);

        // Assert
        Assertions.assertEquals(expectedResult, isValid);
    }

    @Test
    void isValid_test3() {

        // Assign
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String parenthesis = "(]";
        boolean expectedResult = false;

        // Act
        boolean isValid = validParenthesis.isValid(parenthesis);

        // Assert
        Assertions.assertEquals(expectedResult, isValid);
    }

    @Test
    void isValid_test4() {

        // Assign
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String parenthesis = "([])";
        boolean expectedResult = true;

        // Act
        boolean isValid = validParenthesis.isValid(parenthesis);

        // Assert
        Assertions.assertEquals(expectedResult, isValid);
    }

    @Test
    void isValid_test5() {

        // Assign
        ValidParenthesis validParenthesis = new ValidParenthesis();
        String parenthesis = "(((((";
        boolean expectedResult = false;

        // Act
        boolean isValid = validParenthesis.isValid(parenthesis);

        // Assert
        Assertions.assertEquals(expectedResult, isValid);
    }
}