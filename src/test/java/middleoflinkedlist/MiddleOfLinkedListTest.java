package middleoflinkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pojo.ListNode;

class MiddleOfLinkedListTest {

    @Test
    void middleNode_test1() {

        // Assign
        ListNode head = ListNode.arrayToLinkedList(new int[] {1,2,3,4,5});
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        int expected = 3;
        // Act
        int actual = middleOfLinkedList.middleNode(head).val;

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void middleNode_test2() {

        // Assign
        ListNode head = ListNode.arrayToLinkedList(new int[] {1,2,3,4,5,6});
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        int expected = 4;
        // Act
        int actual = middleOfLinkedList.middleNode(head).val;

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}