/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> oldList = new HashMap<>();
        oldList.put(null,null);

        Node current = head;
        while(current != null){
            Node copy = new Node(current.val);
            oldList.put(current, copy);
            current = current.next;
        }

        current = head;
        while(current != null){
            Node copy = oldList.get(current);
            copy.next = oldList.get(current.next);
            copy.random = oldList.get(current.random);
            current = current.next;
        }
        return oldList.get(head);
    }
}
