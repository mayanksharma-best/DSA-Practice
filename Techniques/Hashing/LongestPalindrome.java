//  Approach : Build a Frequency HAshMap then iterate on keySet() if key is even then we directly add in ans, and for odd we (-1) then it becomes even and add in ans. if ek bhi odd key hui (using flag) then return (ans+1) otherwise return ans.
// Time complexity : O(n).
// /Spcae Complexity : O(n).





class Solution {
    public int longestPalindrome(String s) {
      int n = s.length();
      int ans = 0;
      boolean flag = false;
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i = 0; i<n; i++){
        map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
      }

      for(char ch : map.keySet()){

        // Even Keys
        if(map.get(ch) % 2 == 0){
                ans += map.get(ch);
        }

        // Odd Keys
        else{
            ans += (map.get(ch) - 1);
            flag = true;
        }
      }
      if(flag == true){
        return (ans+1);
      }
      else
      return ans;

    }
}