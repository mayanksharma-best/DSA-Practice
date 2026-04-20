// Approach : Pehle har string ko array karke sort karenge jisse same group of anagram same aa jaye
// map me store karenge(String,list of same anagram).
// Time Complexity : n * k log k(sort every string)
// Space Complexity : O(n).

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            // string se chararrya banaya
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);                         // sort the char array jisse har string same anagram ki sme key ho
            String temp1 = new String(temp);           // array ko vapas string me le aysnge

            //  map me store list h us key ki to vo milegi nhi to new empty list milegi
            List<String> list = map.getOrDefault(temp1 , new ArrayList<>());
            list.add(strs[i]);                      // list mili h usme string add karde same anagram h 
            map.put(temp1 , list);                  // map ko bhi update kr denge us key pe list me
        }

        // map ki values me list hogi unko list of list me daal denge
        List<List<String>> ans = new ArrayList<>();
        for(List<String> a : map.values()){
            ans.add(a);
        }
        
        return ans;
    }
}