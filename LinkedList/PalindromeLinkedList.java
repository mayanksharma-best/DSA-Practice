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
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode forward = temp.next;
            temp.next = prev;
            prev = temp;
            temp = forward;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        // Edge case
        if(head.next == null) return true;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        // slow at middle 
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head;
        ListNode newHead = slow.next;
        ListNode second = reverse(newHead);

        // check every element
        while(second != null){
            if(first.val != second.val){
                // reform the LL in original form
                slow.next = reverse(second);
                return false;
            }
            else {
                first = first.next;
                second = second .next;
            }
        }
        // reform the LL in original form
        slow.next = reverse(second);
        return true;
    }
}