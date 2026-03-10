class Solution {
    public int max(int[] nums){
        int n = nums.length;
        int max = nums[0];
        for(int i = 0; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
     }

    public int min(int[] nums){
        int n = nums.length;
        int min = max(nums);
        for(int i = 0; i<n; i++){
            if(min>nums[i]){
                min = nums[i];
            }    
        }
       return min; 
    }

    public boolean isPossible(int[] bloomDay, int m, int k, int mid){
        int n = bloomDay.length;
        int count = 0;
        int boq = 0;
        for(int i = 0; i<n; i++){
            if(mid >= bloomDay[i]){
                count++;
            }
            else{
                boq += count/k;
                count = 0;
            }
        }
        boq += count/k;

        if(boq >= m) return true;
        else return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int low = min(bloomDay);
        int high = max(bloomDay);
        int ans = -1;

        if(m * k > n) return -1;

        while(low<=high){
            int mid = low + (high -low)/2;

            if(isPossible(bloomDay , m , k , mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
   
}