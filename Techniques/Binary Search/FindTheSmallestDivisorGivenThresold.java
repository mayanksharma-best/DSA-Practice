class Solution {
    public int maximum(int[] nums){
        int n = nums.length;
        int maxi = nums[0];
        for(int i = 0; i<n;i++){
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }
        return maxi;

    }

    public boolean isPossible(int[] nums, int threshold , int mid){
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += Math.ceil((double)nums[i]/mid);
        }
        if(sum <= threshold) return true;
        else return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low =  1;
        int high = maximum(nums);
        // int ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(isPossible(nums,threshold,mid)){
                // ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}