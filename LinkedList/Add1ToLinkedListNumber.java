/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head){
        Node dummy = null;
        Node prev = dummy;
        Node temp = head;
        
        while(temp != null){
            Node forward = temp.next;
            temp.next = prev;
            prev = temp;
            temp = forward;
        }
        return prev;
    }
    public Node addOne(Node head) {
        
        Node temp = head;
        temp = reverse(head);
        Node res = temp;
        
        
        int sum = 0;
        int carry = 1;                          // intial node pe ek baar plus 1 kar dega
       
        while(temp != null){
            sum = temp.data + carry;            // node ke data me chnage
            temp.data = sum % 10 ;
            carry = sum/10;                     // carry nikalna if available
            if(carry == 0) break;       // carry nhi h then baki me no chnage
             
            // if end node khtm ho jaye or carry bache then new node create   
            if(temp.next == null){
                Node n = new Node(carry);
                carry = carry/10;
                temp.next = n;
            }
            
            temp = temp.next;
           
            
        }
        
        // res me head of LL hai
        return reverse(res);
        
        
    }
}