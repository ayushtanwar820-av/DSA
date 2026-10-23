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
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> prevNodes = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            for(int i=0 ; i<prevNodes.size() ; i++){
                if(curr == prevNodes.get(i)) return true;
            }
            prevNodes.add(curr);
            curr = curr.next;
        }

        return false;
    }
}