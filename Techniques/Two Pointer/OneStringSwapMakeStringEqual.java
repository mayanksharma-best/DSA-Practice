// Approach : Koi bhi ek String pe loop chalayenge then jese hi different char mile use strore karlo then next char mile use bhi strore karlo dono Strings ke, ek count bana lo agr 3 different mile to retutn karo false , swap strings me perform nhi hoga space bachane ke liye humne cross ke strore character ko check kia agr equal h then true otherwise false.
// Time Complexity: O(n).
// Space Complexity : O(1).






class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i = 0;
        int j = 0;
        int count = 0;
        char c1 = ' ';
        char c2 = ' ';
        char a1 = ' ';
        char a2 = ' ';
        while(i<s1.length()){
           
            if(s1.charAt(i) != s2.charAt(j)){
               if(count == 0){
                    c1 = s1.charAt(i);
                    a1 = s2.charAt(j);
                    count++;
               }
               else if(count == 1){
                    c2 = s1.charAt(i);
                    a2 = s2.charAt(j);
                    count++;
               }
               else return false;
            }
            i++;
            j++;
        }

       
        if(a1==c2 && a2==c1){
            return true;
        }

       


    return (count == 0);

    }
}