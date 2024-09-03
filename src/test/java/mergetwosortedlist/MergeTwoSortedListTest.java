package mergetwosortedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListTest {

    @Test
    void mergeTwoLists_test1() {

        // Assign
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode list1 = mergeTwoSortedList.arrayToLinkedList(new int[] {1,2,4});
        ListNode list2 = mergeTwoSortedList.arrayToLinkedList(new int[] {1,3,4});
        Integer[] expected = new Integer[]{ 1, 1, 2, 3, 4, 4};

        // Act
        ListNode result = mergeTwoSortedList.mergeTwoLists(list1, list2);

        // Assert
        Integer[] resultArray = mergeTwoSortedList.linkedListToArray(result);
        Assertions.assertArrayEquals(expected, resultArray);

    }
}