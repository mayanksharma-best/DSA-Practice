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
    public ListNode reverse(ListNode head){
        ListNode temp  = head;
        ListNode prev = null;
        while(temp != null){
            ListNode forward = temp.next;
            temp.next = prev;
            prev = temp;
            temp = forward;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // first and second ko assign kar dia
        ListNode first = head , second = reverse(slow.next);

        // slow ke element ka connection break karenge
        slow.next = null;

        

        while(second != null){
        // store next link of first and second
        ListNode temp1 = first.next;
        ListNode temp2 = second.next;

        // Build connection
        first.next = second;
        second.next = temp1;

        // move first and second
        first = temp1;
        second = temp2;
    }

        
    }
}
