package org.engripaye.LinkedList;

import org.engripaye.Node.ListNode;

public class FindMiddleOfLinkedList {

    // find the middle of a linked list


    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move slow one step

            fast = fast.next.next; // move fast two steps
        }

        return slow; // slow is now at the middle
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        System.out.println(findMiddle(head).val); // output: 3
    }
}
