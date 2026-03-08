// Approach : solvee from 2 approach bcz no edge case only handle outOfIndex at 0 and n-1 index.
// 1.  check mid+1 > mid it means increasing slope move low to right side otherwise decresing slope store the ans and go to left by move high.
// 2. check it is peak or incresing slope and decresing slope
// Edge Case : Handle OutOfIndex by low = 1 and high = n-2.
// TIme Complexity : O(logn).
// Space Complexity : O(1).


class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int n = arr.length;
        int low = 1;
        int high = n-2;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;

            // Approach -1
            // if(arr[mid]<arr[mid+1]){
            //     low = mid +1;
            // }
            // else{
            //     ans = mid;
            //     high = mid-1;
            // }


            // if both adjacent elemnt is small then it is peak and return
            if( arr[mid]>arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            // if slope is increasing then peak  is at right side
            else if(  arr[mid] > arr[mid-1]){
                low = mid +1;
            }
            // in all other condition peak is left side
            else high = mid-1;
        }
        // return ans;
        return 0;
    }
}