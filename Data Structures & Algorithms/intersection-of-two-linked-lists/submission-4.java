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
        ListNode l1 = headA;
        ListNode l2 = headB;

        while(l1 != l2){
            if(l1 == null){
                l1 = headB;
            }else{
                l1 = l1.next;
            }
            if(l2 == null){
                l2 = headA;
            }else{
                l2 = l2.next;
            }
        }
        
        return l1;
    }
}


        // HashSet<ListNode> seen = new HashSet<>();

        // ListNode dummy1 = headA;
        // ListNode dummy2 = headB;

        // while (dummy1 != null) {
        //     seen.add(dummy1);
        //     dummy1 = dummy1.next;
        // }
        // while (dummy2 != null) {
        //     if (!seen.add(dummy2)) {
        //         return dummy2;
        //     }
        //     dummy2 = dummy2.next;
        // }
        // return null;