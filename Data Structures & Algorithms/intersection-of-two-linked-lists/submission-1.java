/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> seen = new HashSet<>();

        ListNode dummy1 = headA;
        ListNode dummy2 = headB;

        while (dummy1 != null) {
            seen.add(dummy1);
            dummy1 = dummy1.next;
        }
        while(dummy2 != null){
            if(!seen.add(dummy2)){
                return dummy2;
            }
            dummy2 = dummy2.next;
        }
        return null;
    }
}