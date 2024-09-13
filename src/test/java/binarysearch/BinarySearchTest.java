package binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search_test1() {

        // Assign
        int arr[] = {-1,0,3,5,9,12};
        int target = 9;
        int expected = 4;
        BinarySearch binarySearch = new BinarySearch();

        // Act
        int actual = binarySearch.search(arr, target);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void search_test2() {

        // Assign
        int arr[] = {-1,0,3,5,9,12};
        int target = 2;
        int expected = -1;
        BinarySearch binarySearch = new BinarySearch();

        // Act
        int actual = binarySearch.search(arr, target);

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}