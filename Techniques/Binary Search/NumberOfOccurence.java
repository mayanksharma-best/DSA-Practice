// Approach : Pehla Position nikalenge or last position then minus karke index  
// edge case : element na ho then flaf bana ke check kar lenge agr nhi mila to return zero
// Time complexity : O(logn).
// Space Complexity : O(1).

class Solution {
    int countFreq(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int firstPosition = 0;
        int lastPosition = 0;
        boolean flag = false;
        
        // First Position of Element
        while(low<=high){
            int  mid = low + (high-low)/2;
            if(arr[mid] == target){
                firstPosition = mid;
                high = mid - 1;
                flag = true;
                }
                else if(arr[mid] > target){
                    high = mid -1;
                }
                else low = mid + 1;
            }
            
            
            // if element firstPosition of element not found return 0
            if(flag == false) return 0;
            
            // reassign low and high for second loop
            low = 0;
            high = n-1;
            
        // Last Postion
         while(low<=high){
            
            int mid = low + (high-low)/2;
            
            if(arr[mid] == target){
                lastPosition = mid;
                low = mid + 1;
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
            else low = mid+1;
        }  
        
        int ans = lastPosition - firstPosition + 1;
        return ans;
    }
}
