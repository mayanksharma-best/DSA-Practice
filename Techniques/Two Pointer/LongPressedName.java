// Approach :- Dono string ke char euqal h dono pointer move karo else if move j when it equal to typed.charAt(j-1) else retuen false.
// Time Complexity :- O(n).
// Space Complexity :- O(1).



class Solution {
    public boolean isLongPressedName(String name, String typed) {
     
      int j = 0;
      int i = 0;
      
    while(j < typed.length()){

        // i ko out of bound nhi jane dega or dono pointer ko move karega
       if( i<name.length() && name.charAt(i) == typed.charAt(j)){
         i++;
         j++;
      } 

    //   typed me j or j-1 ko match karga only when j>0.
      else if( j>0 && typed.charAt(j) == typed.charAt(j-1)){
        j++;
      }
      else return false;


    }

    //  ye dekhega ki name pura traverse hua hna i == char in name string.
    return i == name.length();
}
}