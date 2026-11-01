/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr = head;

        while(curr != null){
            if(curr.child != null){
                Node forward = curr.next;
                curr.next = curr.child;
                (curr.next).prev = curr;

                Node last = getLastNode(curr.child);
                last.next = forward;
                if(forward != null) forward.prev = last;
                curr.child = null;
            }

            curr = curr.next;
        }
        return head;
    }

    public Node getLastNode(Node head) {

        if(head == null) return null;
        while(head.next != null){
            head = head.next ;
        }
        return head;
    }
}