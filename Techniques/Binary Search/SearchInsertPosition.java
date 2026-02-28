// Approach : Simple binary search lagayenge but return low ko karenge dry run karo samjh aa jayega.
// Time Complexity : O(logn).
// Space Complexity : O(1).



class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(low<=high){
            mid = low + (high -low)/2;
            
            if(nums[mid] == target){
                return mid;
            } 
           else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        // always return low for all cases

        // if(low == 0) return mid;
        // return mid+1;
        return (low);

    }
}