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
    public ListNode middleNode(ListNode head) {
        
        ListNode fast=head;
        ListNode late=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            late=late.next;
        }

        return late;
    }
}
