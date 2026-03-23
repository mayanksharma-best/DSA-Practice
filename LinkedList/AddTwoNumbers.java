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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;
        int sum = 0;

        while(l1 != null || l2 != null){
            sum = carry;                            // sum ko newlystart karna h or carry store karni h 

            if(l1 != null){                          // l1 ki value add hogi 
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){                             // l2 ki value add hogi
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode(sum % 10);         // jab sum 2 digit ka hoga to last digit ki newNode bane
            curr.next = newNode;                                // NewNode ko curr se connect karenge
            curr = curr.next;
            carry = sum/10;                                     // carry ke ander 2 digit me se aage ka no. daal denge
        }
        
        // Edge Case : 
        if(carry != 0){
            ListNode newNode = new ListNode(carry%10);
            curr.next = newNode;
            curr = curr.next;
        }
        return dummy.next;
    }
}