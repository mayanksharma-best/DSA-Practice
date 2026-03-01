// Approach : if (mid == target) return. 
// Steps: 1.Check which side is sorted 
// 2.then we found sorted then check target is betwwen it or otherside 
// 3. Move low and high according to it.
// Time Complexity : O(logn).
// Space Complexity : O(1).

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low + (high -low)/2;
            
             if(nums[mid] == target){
                return mid;
            }
            // check left side sorted 
            if(nums[low] <= nums[mid]){  
                 // if target between left side and mid   
                if(target>=nums[low] && target<nums[mid]){
                    high = mid-1;
                }
                // else target is right side
                else low = mid+1;
            }
            // check right is sorted
            else{
                // target between mid and right side
                if(target>nums[mid] && target<=nums[high]){
                    low = mid+1;
                }
                // right side nahi h target between left side and mid
                else high = mid-1;
                
            }
           
        }
        return -1;
    }
}