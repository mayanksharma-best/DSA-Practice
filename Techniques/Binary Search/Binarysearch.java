// Approach : Binary search bcz array is sorted.
// Time Complexity : O(logn).
// Space Complexity : O(1).


class Solution {
    public int search(int[] nums, int target) {
        
        int n = nums.length;

        // set low and high
        int low = 0;                        
        int high = n-1;
        int ans = -1;

        // working condition till.
        while(low<=high){

            // mid formula
            int mid = (low + high )/2;

            // decision
            if(nums[mid] == target){
                return mid;
            }

            // mid is big from target
            else if(nums[mid]>target){
                high = mid-1;
            }

            // mid is high from low
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}