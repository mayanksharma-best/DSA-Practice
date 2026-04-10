/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = slow.next;
                int count = 1;
              
               
                while(slow != fast){
                    count++;
                    slow = slow.next;
                    // fast = fast.next;
                    
                }
                return count;
                
            }
            
           
            
        }
        return 0;
    }
}