// Approach :- loop on both word with || operater ,then merge individual one by one.
// Time Complexity = O(n+m).
// Space Complexity = O(n+m).





class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
         StringBuilder ans = new StringBuilder();

        //  loop tab tak chalega ek bhi string bachi h merge ke liye
        while(i<word1.length() || j<word2.length()){

           
         // Put word1 char if available
            if(i<word1.length()){
                ans.append(word1.charAt(i));
                i++;
            }

            // Put word2 char if available
            if(j<word2.length()){
                ans.append(word2.charAt(j));
                j++;
            }
           
        }
      
        return ans.toString();
    }
}