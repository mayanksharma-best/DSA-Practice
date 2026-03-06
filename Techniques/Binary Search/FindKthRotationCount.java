// Approach : if mid > n-1 then check right side (low = mid+1) otherwise mid is at right side 
// store the ans and move high = mid-1
// Time COmplexity : O(logn).
// Space COmplexity : O(1).

class Solution {
    public int findKRotation(int arr[]) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int min = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            
            
            // n-1 = always the end number of right side (part 1).
            if(arr[mid] > arr[n-1]){
             low = mid+1;
            }
            else{
                min = mid;
                high = mid-1;
            }
            
        }
        return min;
    }
}