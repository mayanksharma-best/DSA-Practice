// Approach: Two pointer use karenge then s ke pointer ko jab move karenge tab vo t string se match hoga otherwise t string ke pointer ko hi traverse karenge.
// Time Complexity : O(m).
// Space Complexity : O(1).




class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

      

        // dono String pe loop lagayenge jo pehel khtm loop break
        while(i<s.length() && j<t.length()){

            // char safe isliye nhi String s ""  bhi ho sakti h
            // char c1 = s.charAt(i);
            // char c2 = t.charAt(j);

            // if string s me char match hoga then i ko aage badha denge 
            if(s.charAt(i) == t.charAt(j)){
                i++;
               
            }
            j++;
        }

        // isse ye clear hoga string s puri match hui h ya nhi
        return i==s.length();
    }
}