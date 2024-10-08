package mergetwosortedlist;

import pojo.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode newList = null;
        ListNode firstNode = null;

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }
        do {

            if (list1.val <= list2.val) {

                ListNode newNode = new ListNode(list1.val, list1.next);

                if (newList == null) {
                    newList = newNode;
                    firstNode = newList;
                    list1 = list1.next;
                    continue;
                }
                newList.next = newNode;
                newList = newList.next;
                list1 = list1.next;
            } else {

                ListNode newNode = new ListNode(list2.val, list2.next);
                if (newList == null) {
                    newList = newNode;
                    firstNode = newList;
                    list2 = list2.next;
                    continue;
                }
                newList.next = newNode;
                newList = newList.next;
                list2 = list2.next;
            }
        }
        while (list1 != null && list2 != null);

        while (list1 != null) {

            ListNode newNode = new ListNode(list1.val, list1.next);
            newList.next = newNode;
            newList = newList.next;
            list1 = list1.next;
        }

        while (list2 != null) {

            ListNode newNode = new ListNode(list2.val, list2.next);
            newList.next = newNode;
            newList = newList.next;
            list2 = list2.next;
        }

        return firstNode;
    }
}
