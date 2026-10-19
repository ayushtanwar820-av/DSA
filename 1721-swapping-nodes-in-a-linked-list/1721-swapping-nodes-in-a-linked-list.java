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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front = head ;
        ListNode back = head ;
        ListNode temp = head ;
        int size = 1 ;

        while(temp != null){
            temp = temp.next ;
            size++ ;
        }

        temp = head ;
        int backIdx = size-k ;
        int i = 1 ;
        while(temp != null){
            if(i == k){
                front = temp ;
            }
            if(i == backIdx){
                back = temp ;
            }
            i++ ;
            temp = temp.next ;
        }
        int tempVal = front.val ;
        front.val = back.val ;
        back.val = tempVal ;

        return head ;
    }
}