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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftptr = head;

        for(int i=1 ; i<=left-1 ; i++){
            leftptr = leftptr.next;
        }

        while(left < right){
            ListNode rightptr = head;
            for(int i=1 ; i<=right-1 ; i++){
                rightptr = rightptr.next;
            }
            
            int temp = leftptr.val;
            leftptr.val = rightptr.val;
            rightptr.val = temp;

            right--;
            left++;
            leftptr = leftptr.next;
        }

        return head;
    }
}