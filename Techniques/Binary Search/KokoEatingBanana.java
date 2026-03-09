// Approach = 1. binary search on speed of the koko.
// 2. for binary search low willl be 1 / 0 bcz eating spped minimum is 1 .
// 3.high point on maximum of array bcz in 1 eat all bananas of piles[i] and it is the maximu speed.
// 4.calculate =  Math.ceil(piles[i]/mid ) bcz if in decimal consider as upper integer . bcz she eates slowly or without finish not move to another.
// 5.Simple binary search if eating hour is greter the gaurd hour then increse speed otherwise store and find minimum speed on left side.
// Edge Case : if (n < hour of gaurd) return 0; bcz maximum speed se bhi (minimum hour = n). 
// Time Complexity : O(NlogM) => n size of array and M maximum speed.
// Space cOmplexity : O(1).



class Solution {
   
    // Calculate mid wali speed se banana khtm karne me hours 
    public int eatingHours(int[] piles, int mid){
        int n = piles.length;
        int hour = 0;
        for(int i = 0; i<n ; i++){
            hour += Math.ceil((double)piles[i]/mid);
            // hour += (piles[i] + mid - 1) / mid;
        }
        return hour;
    }

    // Maximum of given array / End point for bianry search apply
    public int maximum(int[] piles){
        int n = piles.length;
        int maxi = piles[0];
        for(int i = 1; i<n; i++){
            if(maxi < piles[i]){
                maxi = piles[i];
            }
        }
        return maxi;
    }

    // Binary Search on the eat in 1 hour range from 1 to maximum element of given array 
    public int minEatingSpeed(int[] piles, int h) {
        // low minimum of array nhi hoga bcz speed kam bhi ho sakti h 
        int low = 1;
        int high = maximum(piles);
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;

            // hours to eat all banana at speed of mid
            int hours = eatingHours(piles,mid) ;
             
            // if eat all banana before guard come or equal to guard hour and eating hours
            if(hours <= h){
                ans = mid;
                high = mid -1;
            }
            // speed is low go right side
            else low = mid + 1;
        }
        return ans;
        }
}