// Approach : 1. Sorted side nikalenge check karenge left ko if sorted then search in left side otherwise right side.
// 2. jab left side sorted aa jayenge then if target between low and mid then shift high otherwise low .
// 3. when right is sorted then if target between mid and high then shift low otherwise high .
// Edge Case : when( mid == high == low ) jab teeno equal hoge then we shift low++ and high-- until all are different.
// time Complexity : O(log n) average , O(n) worst case (due to duplicates).
// Space Complexity : O(1).



class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                return true;
            }
            
            // Handle Edge Case
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            // if left side is sorted
            if(nums[low] <= nums[mid]){
                // target betwwen left
                if(target >= nums[low] && target<nums[mid]){
                    high = mid-1;
                }
                // target not left side
                else{
                    low = mid+1;
                }
            }
            // left is not sorted
            else{
                // target betwwen mid and high
                if(target>nums[mid] && target<=nums[high]){
                    low = mid + 1;
                }
                // target not at right side
                else{
                    high = mid-1;
                }
            }
        }

        return false;
    }
}