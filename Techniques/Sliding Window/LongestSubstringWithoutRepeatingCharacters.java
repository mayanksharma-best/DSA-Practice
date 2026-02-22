// Approach : Using SLiding Window and Hashmap . Condition violet  frequency of last inserted char is > 1 then shrink it.
// Time Complexity : O(n).
// Space Complexity : O(n). 






class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap< Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxi = 0;
        while(j<s.length()){
            // Frequency HashMap
           map.put(s.charAt(j) , map.getOrDefault(s.charAt(j),0)+1);

            // Window Expand
           if(map.get(s.charAt(j)) <= 1){
            maxi = Math.max(maxi,j-i+1); 
            j++;
           }
        
            // Condition violets
           else if(map.get(s.charAt(j))>1){
            // shrink window
            while(map.get(s.charAt(j)) >1){
            // reduce frequency from i pointer
            map.put(s.charAt(i) , map.get(s.charAt(i))-1);
            if(map.get(s.charAt(i)) == 0){
                map.remove(s.charAt(i));
            }
            i++;

            }
            maxi = Math.max(maxi,j-i+1); 
            j++;
             }

        }

return maxi;

    }
}