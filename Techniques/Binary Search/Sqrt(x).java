// Approach : use loop from 0 to x and set low and high use basic binary search and return high.
// Edge Case : use typecasting for return
// Time Complexity : O(logn).
// Space Complexity : O(1).

class Solution {
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        while(low<=high){
            long mid = low + (high -low)/2;

            if(mid*mid == (long)x){
                return (int)mid;
            }
            else if(mid*mid > (long)x){
                high = mid-1;
            }
            else low = mid+1;
        }
        // typecaste
        return (int)high;
    }
}