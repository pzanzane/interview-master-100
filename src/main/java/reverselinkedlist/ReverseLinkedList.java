package reverselinkedlist;

import pojo.ListNode;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode prev = null;
        while(head != null) {

            prev = new ListNode(head.val, prev);;
            head = head.next;
        }
        return prev;
    }
}
