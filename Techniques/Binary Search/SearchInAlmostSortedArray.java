// Approach : binary search use karke mid nikalenge or saath hi uska (mid-1) aur (mid +1) check.
// Edge case: out of bond na jaye isliye adjacent dekhte time isliye (mid>0) and (mid<n-1)
// Time Complexity : O(logn).
// Space COpmexity : O(1).



class Solution {
    public int findTarget(int arr[], int target) {
    int n = arr.length;
    int low = 0;
    int high = n-1;
   
    while(low<=high){
        int mid = low + (high - low)/2;
        if(arr[mid] == target){
            return mid;
        }
    // Edge case handle (mid>0) out of Bound
        if( mid>0 && arr[mid-1] == target){
            return mid-1;
         }
        
    // Edge case handle through (mid<n-1) out of bound 
        if( mid<n-1 && arr[mid+1] == target){
            return mid + 1;
        }
        
        else if(arr[mid] > target){
            high =  mid -1;
        }
        else low = mid + 1;
    }
    
    return -1;
        
    }
}