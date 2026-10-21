/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode forward = node.next;
        ListNode nextForward = forward.next;

        node.val = forward.val;
        node.next = nextForward;
    }
}