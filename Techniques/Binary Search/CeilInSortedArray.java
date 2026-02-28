// Approach : use binary search similar to floor 
// Ceil = just bada element ya equal to target

// Time Complexity : O(logn).
// Space Complexity : O(1).

class Solution {
    public int findCeil(int[] arr, int x) {
       
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            
        // store for ceil is equal
         if(arr[mid] == x){
            ans = mid ;
            high = mid-1;
        }
        // Store and check left side bcz smallest h 
        else if(arr[mid] > x){
            ans = mid;
            high = mid-1;
        }
        else low = mid+1;
        }
        
        return ans;
    }
}
