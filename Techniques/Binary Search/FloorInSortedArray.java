// Approach : Binary search use hoga array Sorted h . 
// floor = target se just chota ya fir target ke equal.
// Time Complexity : O(logn).
// Space Complexity : O(1).

class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <=high){
            int mid = low + (high - low )/2;
            
            // Store the floor equal to target and check right side
            if(arr[mid] == x){
                ans = mid;
                low = mid + 1;
            }
            
             else if(arr[mid] > x){
                high = mid-1;
               
            }
            // Store ans then check  bigger element from current floor 
            // present on right side only
            else{
                ans = mid;
                low = mid+1;
            }
            
        }
        return ans;
    }
}
