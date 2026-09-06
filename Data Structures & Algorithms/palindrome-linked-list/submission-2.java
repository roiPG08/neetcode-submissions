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
    public boolean isPalindrome(ListNode head) {
        //split, reverse, check if the same going from start of the non-sealed
        ListNode slow = head;
        ListNode fast = head;

        //split
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse second
        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while(second!=null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }
        
        ListNode left = head;
        ListNode right = prev;
        //Loop and check each linkedList
        while(right != null){
            if(left.val == right.val){
                left = left.next;
                right = right.next;
            }else{
                return false;
            }
        }
        return true;
    }
}