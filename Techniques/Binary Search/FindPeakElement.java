// Approach : Check on if element is peak / else if element is at increasing slope / else decresing slope or lower point in miltiple slope.
// if element is at incresing slope the peak is at right side low = mid+1 otherwise high = mid-1;
// Edge Case : when size of array is 1 return 0.
// OutOfBound case by low = 1 and high = n-2 also check early that is not peak element.
// Time COmplexity : O(logn).
// Space Complexity : O(1)



class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n-2;

        // If 1 element then it becomes peak bcz [-infinity] at (-1 , n) index
        if(n==1) return 0;
        
        // edge case only check nums[1] on nums[0] to avoid outOfIndex
        if( nums[0] > nums[1]){
            return 0;
        }

        // edge case only check nums[n-2] on nums[n-1] to avoid outOfIndex
        if( nums[n-1] > nums[n-2]){
           return n-1;
        }
        
        while(low<=high){
            int mid = low + (high-low)/2;

            // if both adjacent elemnt is small then it is peak and return
            if( nums[mid]>nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            // if slope is increasing then peak  is at right side
            else if(  nums[mid] > nums[mid-1]){
                low = mid +1;
            }
            // in all other condition peak is left side
            else high = mid-1;
        }
        return 0;
    }
}


// Also solve using modified binary search

