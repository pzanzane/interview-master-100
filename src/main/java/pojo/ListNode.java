package pojo;

import java.util.ArrayList;
import java.util.List;

/** Definition for singly-linked list. */
public class ListNode {

    public static ListNode arrayToLinkedList(int[] array) {

        ListNode node = null;
        ListNode firstNode = null;
        for (int value: array) {
            if (node == null) {
                node = new ListNode();
                firstNode = node;
            } else {
                node.next = new ListNode();
                node = node.next;
            }

            node.val = value;
        }

        return firstNode;
    }

    public static Integer[] linkedListToArray(ListNode node) {
        List<Integer> list = new ArrayList<>();

        while (node != null) {

            list.add(node.val);
            node = node.next;
        }
        return list.toArray(Integer[]::new);
    }

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
