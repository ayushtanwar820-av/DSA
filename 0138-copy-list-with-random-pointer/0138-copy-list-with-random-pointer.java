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
        if(head == null) return head;
        Node curr = head;
        HashMap<Node, Node> map = new HashMap<>();

        Node copyHead = new Node(head.val);
        copyHead.next = curr.next;
        
        map.put(curr, copyHead);

        Node copyTail = copyHead;
        curr = curr.next;

        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next =  curr.next;

            copyTail.next = newNode;
            copyTail = newNode;

            map.put(curr, copyTail);

            curr = curr.next;
        }

        curr = head;
        copyTail = copyHead;

        while(curr != null){
            Node copyRandom = map.get(curr.random);

            copyTail.random = copyRandom;
            copyTail = copyTail.next;
            curr = curr.next;
        }

        return copyHead;
    }
}