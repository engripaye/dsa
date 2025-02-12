package org.engripaye.TwoPointers;


import org.engripaye.Node.ListNode;

public class ReverseALinkedList {

    // 1 -> 2 -> 3 -> 4 -> 5 to 5 -> 4 -> 3 -> 2 -> 1

        public static ListNode reverseList(ListNode head) {
            ListNode prev = null; // holds the previous node
            ListNode current = head; // start at the first node

            while (current != null) {
                ListNode next = current.next; // save next node

                current.next = prev; // reverse the link

                prev = current; // move prev forward

                current = next ; // move current forward
            }

            return prev; // new head of the reverse list
        }

        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(STR."\{current.val} -> ");
                current = current.next;
            }
            System.out.println("null");
        }

    public static void main(String[] args) {

            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            System.out.print("Original list: ");

            printList(head);

            head = reverseList(head); // Reverse the list

            System.out.print("Reverse list: ");
            printList(head);
    }

}
