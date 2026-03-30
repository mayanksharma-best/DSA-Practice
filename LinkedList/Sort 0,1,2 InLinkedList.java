/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        
        
        if (head == null || head.next == null) return head;

        // 1. Aapne jaise dummy nodes soche the:
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        // 2. Teeno ke liye pointers banaye:
        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;

        Node curr = head;

        // 3. Pura list traverse karenge:
        while (curr != null) {
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            } else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            } else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        
        // Agar 1s hain (oneDummy.next != null), to zero ko one se connect karo, 
        // warna direct two se connect karo.
        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        
        // 1s ko 2s se connect karo
        one.next = twoDummy.next;
        
        // Sabse important: last node ko null par set karo taaki cycle na bane
        two.next = null;

        // Naya head zeroDummy ka agla node hoga
        return zeroDummy.next;
    }

   
}