class Solution {
    public int maxWeight(int[] weights){
        int n = weights.length;
        int maxi = weights[0];
        for(int i = 0; i<n; i++){
            if(weights[i]>maxi){
                maxi = weights[i];
            }
        }
        return maxi;
    }
    public int totalWeight(int[] nums){
        int n = nums.length;
        int sum = 0;
        for(int i =0; i<n; i++){
            sum += nums[i];
        }
        return sum;
    }
    public int isPossible(int[] weights , int days , int mid){
        int n = weights.length;
        int day = 0;
        int sum = 0;
        for(int i = 0; i<n; i++ ){
            if(sum + weights[i] > mid){
                day++;
                sum = weights[i];
            }
            else{
                sum += weights[i];
            }
        }
        // last weight ko transport karne ke liye 
        return day + 1;
    }
    public int shipWithinDays(int[] weights, int days) {
       int low = maxWeight(weights); 
       int high = totalWeight(weights);
    //    int ans = -1;

       while(low<=high){
        int mid = low + (high-low)/2;

        if(isPossible(weights,days,mid) <= days ){
            // ans = mid;
            high = mid -1;
        }
        else low = mid + 1;
       }
       return low;
    }
}