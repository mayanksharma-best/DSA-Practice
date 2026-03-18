// Approach : CircularMax = (totalSum - minimumSum) and return max from normalMax or circularMax.
// Time Complexity : O(n).
// Space Complexity : O(1).
// Edge Case : when all elements are negatuve.

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int currMin = 0;
        int currMax = 0;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int total = 0;
        for(int i=0; i<n; i++){
            // Calculate totalSum
            total += nums[i];

            // maxSum
            currMax = Math.max(currMax + nums[i] , nums[i]);
            currMin = Math.min(currMin + nums[i] , nums[i]);

            // minSum
            maxi = Math.max(currMax,maxi);
            mini = Math.min(currMin,mini);

        }
        // circularSum 
        int circular = total - mini;

        // Edge Case
        if(maxi<0){
            return maxi;
        }
        else {
        // return max from normal sum or circular sum
        return Math.max(circular,maxi);
    }

    }
}