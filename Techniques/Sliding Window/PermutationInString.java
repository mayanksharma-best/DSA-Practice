// Approach : String ka frequency array banayenge then ek method bana ke check karenge vo equal h ya nahi aur sliding window fixed use karenge.
// Time Complexity : O(n).
// Space Complexity : O(1).

class Solution {

    // Method to check both array are equal?
    public boolean isEqual(int[] freq1 , int[] freq2){
        for(int i = 0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }


    public boolean checkInclusion(String s1, String s2) {

        // build char array
       int[] freq1 = new int[26];
       int[] freq2 = new int[26];

        // Frequency array of freq1
       for(int i = 0; i<s1.length(); i++){
        freq1[s1.charAt(i) - 'a']++;
       }

        int i = 0;
        int j = 0;

        // Sliding Window
        while(j<s2.length()){

            // Building freq2 Frequency array
            freq2[s2.charAt(j) - 'a']++;

            // Expand window
            if(j-i+1<s1.length()){
                j++;
            }

            // window found
            else if(j-i+1 == s1.length()){
                if(isEqual(freq1,freq2)){
                    return true;
                }

                // remove i index element
                freq2[s2.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }
       
        return false;
      


    }
}