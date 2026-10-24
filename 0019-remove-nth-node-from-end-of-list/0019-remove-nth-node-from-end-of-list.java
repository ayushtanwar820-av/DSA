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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode prev = dummy;
        ListNode curr = dummy;

        for(int i=1 ; i<=n+1 ; i++){
            curr = curr.next;
        }

        while(curr != null){
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = (prev.next).next;

        return dummy.next;
    }
}