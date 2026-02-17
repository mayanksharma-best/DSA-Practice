// Approach : Vowels count karenge firstHalf and secondHalf string me if equals return true else false.
// Time Complexity : O(n).
// Space Complexity : O(n).



class Solution {

// vowel count function
    public int countVowels(String str){
        str =  str.toLowerCase();
         int count = 0;
         for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }
         }
         return count;
    }


    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        String a = s.substring(0,mid);
        String b = s.substring(mid);

        int count1 = countVowels(a);
        int count2 = countVowels(b); 

        if(count1 == count2){
            return true;
        }
        return false;
        
    }
}