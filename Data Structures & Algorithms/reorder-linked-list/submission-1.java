/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        //SPLIT LISTS
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //REVERSE THE ORDER FOR FAST
        ListNode second = slow.next; //current
        ListNode prev = slow.next = null; //current - 1
        while(second != null){
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        //MERGE
        ListNode first = head;
        second = prev;
        while(second != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}
