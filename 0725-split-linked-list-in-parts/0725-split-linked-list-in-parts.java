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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        ListNode[] result = new ListNode[k];

        while(temp != null){
            size++;
            temp = temp.next;
        }

        int baseSize = size/k;
        int extraSize = 0;
        if(baseSize != 0){
            extraSize = size%k;
        }
        int j=0;

        temp = head;
        while(temp != null){
            ListNode start = temp;

            for(int i=1 ; i<=baseSize-1 && temp!=null ; i++){
                temp = temp.next;
            }
            if(extraSize != 0){
                temp = temp.next;
                extraSize--;
            }

            if(temp != null){
                ListNode forward = temp.next;
                temp.next = null;
                temp = forward;
            }
            result[j] = start;
            j++;
        }

        for(int l=j ; l<k ; l++){
            result[j] = null;
        }

        return result;
    }
}