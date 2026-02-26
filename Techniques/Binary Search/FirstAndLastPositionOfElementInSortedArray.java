// Approach : Pehle First Position nikalenge then Last position nikalenge Basic Binary Search.
// Time Complexity : O(logn).
// Space Complexity : O(1).

class Solution {

    // Last Position
    public int lastPosition(int[] arr, int value){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans1 = -1;
        while(low<=high){
            int mid = (low + high )/2;
            if(arr[mid] == value){
                ans1 = mid ;
                low = mid + 1;
            }
            else if(value > arr[mid]){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
         }
         return ans1;
    }

    // First Position 
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans2 = -1;
        int [] ar = new int[2];
        int ans1 = lastPosition(nums, target);
        while(low<=high){
            int mid = (low + high )/2;
            if(nums[mid] == target){
                ans2 = mid ;
                high = mid - 1;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else high =  mid -1;
        }
        // Store in Array
         ar[0] = ans2;
         ar[1] = ans1;
          return ar;
     }
}