package reverselinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pojo.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseList_test1() {

        // Assign
        int[] array = {1,2,3,4,5};
        ListNode root = ListNode.arrayToLinkedList(array);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Integer[] expected = {5,4,3,2,1};

        // Act
        ListNode newRoot = reverseLinkedList.reverseList(root);

        // Assert
        Integer[] actual = ListNode.linkedListToArray(newRoot);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void reverseList_test2() {

        // Assign
        int[] array = {1,2};
        ListNode root = ListNode.arrayToLinkedList(array);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Integer[] expected = {2,1};

        // Act
        ListNode newRoot = reverseLinkedList.reverseList(root);

        // Assert
        Integer[] actual = ListNode.linkedListToArray(newRoot);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void reverseList_test3() {

        // Assign
        int[] array = {};
        ListNode root = ListNode.arrayToLinkedList(array);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Integer[] expected = {};

        // Act
        ListNode newRoot = reverseLinkedList.reverseList(root);

        // Assert
        Integer[] actual = ListNode.linkedListToArray(newRoot);
        Assertions.assertArrayEquals(expected, actual);
    }
}