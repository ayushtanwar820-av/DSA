/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> nodesA = new ArrayList<>();

        for(ListNode temp=headA ; temp!=null ; temp = temp.next){
            nodesA.add(temp);
        }
        
        for(ListNode temp=headB ; temp!=null ; temp = temp.next){
            for(int i=0 ; i<nodesA.size() ; i++){
                if(temp == nodesA.get(i)){
                    return temp;
                }
            }
        }
        return null;
    }
}