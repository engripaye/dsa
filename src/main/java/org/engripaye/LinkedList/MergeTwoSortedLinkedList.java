package org.engripaye.LinkedList;

import org.engripaye.Node.ListNode;

public class MergeTwoSortedLinkedList {

    // merge two sorted arrays into one

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if( l1 == null ) return l2; // if first list is empty, return second list

        if(l2 == null) return l1; // if second list is empty, return first list

        if (l1.val < l2.val) { // pick smaller value
            l1.next = mergeTwoLists(l1.next, l2);

            return l1;

        }else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void printList (ListNode head) {
        while (head != null) {
            System.out.print(STR."\{head.val} -> ");

            head = head.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        ListNode merged = mergeTwoLists(l1, l2);

        printList(merged);


    }
}
