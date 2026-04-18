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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        int max = 0;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = head;
        ListNode newHead = slow.next;
        ListNode second = reverse(slow.next);

        while(second != null){
            max = Math.max(max , (first.val + second.val));
            first = first.next;
            second = second.next;
        }

        return max;
        
        
    }
}