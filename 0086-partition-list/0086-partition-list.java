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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;

        ListNode largeHead = new ListNode(-1);
        ListNode largeTail = largeHead;
        
        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                smallTail.next = curr;
                smallTail = curr;
            }
            else{
                largeTail.next = curr;
                largeTail = curr;
            }
            curr = curr.next;
        }
        smallTail.next = largeHead.next;
        smallHead = smallHead.next;
        largeTail.next = null;

        return smallHead;
    }
}