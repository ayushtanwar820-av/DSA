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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                prev = slow;
                slow = slow.next;
            }
        }
        prev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return merge(left, right);
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode result = dummy;

        while((left != null) && (right != null)){
            if(left.val > right.val){
                result.next = right;
                right = right.next;
            }
            else{
                result.next = left;
                left = left.next;
            }
            result = result.next;
        }

        if(left == null) result.next = right;
        else result.next = left;

        return dummy.next;
    }
}