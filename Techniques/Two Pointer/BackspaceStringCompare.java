// Approach : Start pointer from ends on both strings First we check # and then delete(skip the char) and check they are equal then true else false . Do this all this inside a while loop.
// Edge Case : when one string become empty and other not.
// Time Complexity: O(n).
// Space Complexity : O(1).







class Solution {
    public boolean backspaceCompare(String s, String t) {
     int n = s.length();
     int m = t.length();
     int i = n-1;
     int j = m-1;
     int countS = 0;
     int countT = 0;
   

     // outer loop h har iteration check karega .

     while(i>=0 || j>=0){

        // only delete the # till that char 
        while(i>=0){
            if(s.charAt(i) == '#'){
                countS++;
                i--;
            }
            else if(countS>0){
                i--;
                countS--;
            }

            // outer loop continue karega next iteration
            else break;
        }

        // inner loop # ko remove 
        while(j>=0){
            if(t.charAt(j) == '#'){
                countT++;
                j--;
            }
            else if(countT >0){
                j--;
                countT--;
            }
            else break;
        }

        // pehle check karenge dono string ke char ki index 0 se bade h or apas me equal h 
        if(i>=0 && j>=0 && s.charAt(i) != t.charAt(j))        // jb dono ki zero se jayda hogi ya dono ki kam hogi or equal hoge tab ye execute nhi hogi
        return false;

        // Edge case
        // koi bhi index (-) me jayega akela kisi  ek string ka to false return kar dega 
        if(i>=0 != j>=0)
        return false;
       
       // outer loop manage handle karna
        i--;
        j--;
        

     }
     return true;
    }
}