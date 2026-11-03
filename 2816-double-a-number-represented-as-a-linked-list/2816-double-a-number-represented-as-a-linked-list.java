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
    public ListNode doubleIt(ListNode head) {

        if((head == null) || (head.val == 0)) return head;
        head = reverseList(head);
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
    
        ListNode prev = dummy;
        ListNode curr = head;
        int carry = 0;

        while(curr != null){
            int multiply = curr.val*2 + carry;
            
            int digit  = multiply%10;
            carry = multiply/10;

            curr.val = digit;

            prev = prev.next;
            curr = curr.next;
        }

        if(carry != 0){
            ListNode temp = new ListNode(carry);
            prev.next = temp;
        }

        head = reverseList(head);

        while((head != null) && (head.val == 0)){
            head = head.next;
        }
        return head;
    }

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }
}