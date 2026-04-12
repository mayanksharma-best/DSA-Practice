// Approach : Build frequency hashmap the make variable and store the occurence of any char , the use keySet() to iterate on all keys if all keys equals to that variable the return true otherwise return false.
// Time Complexity : O(n).
// Space Complexity : O(n).






class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i =0; i<n; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        int compare = map.get(s.charAt(0));

        for( char ch : map.keySet()){
            if(map.get(ch) !=compare){
                return false;
            }
        }
        return true;

    }
}