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
    public ListNode deleteMiddle(ListNode head) {
        int n = 0;
        ListNode temp = head;

        // Find length
        while(temp != null){
            n++;
            temp = temp.next;
        }
        // edge 
        if(n==1) return null;

        temp = head;
        int mid = n/2;
        // temp ko mid-1 pe lejana
        for(int i = 0; i < mid-1; i++){
            temp = temp.next;
        }

        // mid ko tabhi hataye jb uske baad element exist ho
        if(temp.next != null){
        temp.next = temp.next.next;
        }
        // Otherwise usko direct null se connect krdo 
        else temp.next = null;

        return head;
        
    }
}