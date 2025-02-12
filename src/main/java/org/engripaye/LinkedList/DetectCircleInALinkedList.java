package org.engripaye.LinkedList;

import org.engripaye.Node.ListNode;

public class DetectCircleInALinkedList {

    // a linked list with a circle is A CIRCULAR PATH you keep following the link and never reaches the end

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // move one step

            fast = fast.next.next; // move two steps

            if(slow == fast) return true; // cycle detected

        }
        return false; // no cycle
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // create a cycle

        System.out.println(hasCycle(head)); // output true
    }


}

