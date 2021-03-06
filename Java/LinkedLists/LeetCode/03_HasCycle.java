/*  DESCRIPTION: Given a linked list, determine if it has a cycle in it.
Follow up:
Can you solve it without using extra space?
*/

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
        ListNode current = head;
        ListNode fast = head;
        if(head == null){
            return false;
        }
        while(fast.next != null && fast.next.next != null){
            current = current.next;
            fast = fast.next.next;
            if(current == fast){
                return true;
            }
        }
        return false;
    }
}
