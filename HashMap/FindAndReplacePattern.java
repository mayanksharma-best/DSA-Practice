// Approach : (1) ek convert function banayenge usme word ko no. me convert karenge every distinct char have different no. from 0. then hashmap bana ke agr vo exist nhi krta h to map me dalenge saath me ek varibale bana denge and increse karenge for every new char. if exist then normally append kar denge.
// (2) List bana ke words pe foreach loop lagayenge if word equal to h pattern then add in list.

// Time Complexity : O(n);
// Space Complexity : O(n*k).




class Solution {

    public String convert(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int idx = 0;
        StringBuilder  sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){    
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , idx);
                idx++;
             }
             sb.append(map.get(s.charAt(i)));

            //  Edge case : jab no. 10 se uper honge to unhe proper read ke liye bich me gap daal dia h 
             sb.append("-");

        }    
        return sb.toString();
    }




    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();

        String patt = convert(pattern);
        for(String word : words){
            if(convert(word).equals(patt)){
                list.add(word);
            }
        }
        return list;
        
    }
}



    

