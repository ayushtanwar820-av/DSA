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

    public ListNode midPoint(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
        }

        return slow;
    }

    public ListNode reverse(ListNode head) {
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

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode list1 = head;
        ListNode list2 = (midPoint(head));

        while((temp.next != null) && (temp.next != list2)){
            temp = temp.next;
        }
        temp.next = null ;
        list2 = reverse(list2) ;

        while(list1 != null){
            if(list1.val != list2.val) return false;
            list1 = list1.next;
            list2 = list2.next;
        }

        return true;
    }
}