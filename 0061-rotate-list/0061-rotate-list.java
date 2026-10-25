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
    public ListNode rotateRight(ListNode head, int k) {


        int size = 0;
        for(ListNode temp=head ; temp!=null ; temp=temp.next) size++;
        if(k==0 || size<=1) return head;

        k = k%size;
        if(k == 0) return head;

        ListNode temp = head;
        int rightIdx = size-k;

        for(int i=1 ; i<rightIdx ; i++){
            temp = temp.next;
        }

        ListNode ans = temp.next;
        temp.next = null;

        temp = ans;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;

        return ans;
    }
}