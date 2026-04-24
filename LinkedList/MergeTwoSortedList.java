// Approach : Using dummy node then move pointer on both list. 




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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = list1;
        ListNode b = list2;
        // ListNode next1 = null;
        // ListNode next2 = null;
        // ListNode res = null;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;


        // When any list is empty
        if(a == null){
            if(b == null){
                return null;
            }
            else return b;
        }

        if(b == null){
            if(a == null){
                return null;
            }
            else return a;
        }

        

        while(a != null && b != null){
            

            if( a.val <= b.val){
                temp.next = a;
                a = a.next;
                temp = temp.next;
            }
            else if(b.val < a.val){
                temp.next = b;
                b = b.next;
                temp = temp.next;
            }

        }


        // For different size of list
        if(b != null && a == null){
            temp.next = b;
        }
        else {
            temp.next = a;
        }
        return dummy.next;

    }
}