/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        while(fast != null){
            fast = fast.next;
            
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }

            if(slow == fast){
                isCycle = true;
                break;
            }
        }

        if(!isCycle) return null;

        slow = head;
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}