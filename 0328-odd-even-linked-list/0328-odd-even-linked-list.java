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
    public ListNode oddEvenList(ListNode head) {
        int count = 1;
        ListNode temp = head;
        ListNode dummy1 = new ListNode(-1);
        ListNode oddHead = dummy1;
        ListNode oddTail = dummy1;
        
        ListNode dummy2 = new ListNode(-1);
        ListNode evenHead = dummy2;
        ListNode evenTail = dummy2;

        while(temp != null){
            if((count&1) == 1){
                oddTail.next = temp;                     
                oddTail = oddTail.next;
            }
            else{
                evenTail.next = temp;
                evenTail = evenTail.next;
            }
            count++;
            temp = temp.next;
        }

        if((count&1) == 0) evenTail.next = null;
        else oddTail.next = null;

        evenHead = evenHead.next;
        oddHead = oddHead.next;

        oddTail.next = evenHead;

        return oddHead;
    }
}