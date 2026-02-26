// Approach : Using binary search ,Loop 1 se num tak chalayenge if(mid*mid == num) return true otherwise  false.
// Edge case : use long to control overflow
// Time complexity : O(logn).
// Space Complexity : O(1).



class Solution {
    public boolean isPerfectSquare(int num) {
        // start
        long low = 1;
        // End
        long high = num;
        while(low<=high){
            long mid = low + (high-low)/2 ;
            if(mid * mid == num){
                return true;
            }
            else if (mid * mid > num){
                high = mid -1;

            }
            else low = mid +1;
        }
        return false;
    }
}