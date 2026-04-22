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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode oldHead = head;
        ListNode temp = head;
        int count = 0;
        ListNode res = head;
        int ans = 0;
        ListNode prevTail = oldHead;                // prev tail of every group

        while(temp != null){
            
            count++;

            if(count == k){
                
                ListNode nextHead = temp.next;
                temp.next = null;
                ListNode newHead = reverse(oldHead);

                if(ans == 0){                   // pehla reverse group uska head hi ans hoga
                    res = newHead;
                    ans++;
                }

                
                ListNode currTail = oldHead;                // current tail of group
                

                prevTail.next = newHead;                     // prev tail se newHead 
                currTail.next = nextHead;                    // currTail se neaxtHead group ka
                oldHead = nextHead;                          // old head ko update karns 
                count = 0;                                   // cout 0 to find anaothr group

                temp = nextHead;                             //  temp update

                prevTail = currTail;                 // sab kch ho jaye then currTail ab prev bn gya
            }

            else temp = temp.next;

        }

        return res;
        
    }
}