// Approach : Sort the people (reason : because we need to put one light and other heavy weight , so without sorting it is not possible) , then put two pointer on both end and take people from both end if weight under limit then move both pointer otherwise single from highest weight and manage boat count.
// Time Complexity : O(nlogn).
// Space Complexity : O(1).





class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int i = 0;
        int j = n-1;
        int count = 0;
        while(i<=j){
           
            if(people[i]+people[j]<=limit){
                count++;
                i++;
                j--;
            }
           else{
                count++;
                j--;}
           
        }
        return count;
        
    }
}