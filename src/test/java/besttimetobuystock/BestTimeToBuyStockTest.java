package besttimetobuystock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyStockTest {

    @Test
    void maxProfit_test1() {

        // Assign
        int[] prices = {7,1,5,3,6,4};
        int expected = 5;
        BestTimeToBuyStock bestTimeToBuyStock = new BestTimeToBuyStock();

        // Act
        int actual = bestTimeToBuyStock.maxProfit(prices);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxProfit_test2() {

        // Assign
        int[] prices = {7,6,4,3,1};
        int expected = 0;
        BestTimeToBuyStock bestTimeToBuyStock = new BestTimeToBuyStock();

        // Act
        int actual = bestTimeToBuyStock.maxProfit(prices);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxProfit_test3() {

        // Assign
        int[] prices = {1};
        int expected = 0;
        BestTimeToBuyStock bestTimeToBuyStock = new BestTimeToBuyStock();

        // Act
        int actual = bestTimeToBuyStock.maxProfit(prices);

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}