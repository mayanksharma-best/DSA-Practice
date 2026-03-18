// Approach : they want only sum not a subarray then we use Kadane's . (sum = 0 when it becomes negative).
// Time Complexity : O(n).
// Space Complexity : O(1).

class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        
        int max = Integer.MIN_VALUE;
        int  sum = 0;

        for(int i = 0; i<n; i++){
            sum += nums[i];
            max  = Math.max(max,sum);
            if(sum<0){                      // kadanes logic whenever sum becomes negative update it as a 0.
                sum = 0;
            }
        }
        return max;

    }
}