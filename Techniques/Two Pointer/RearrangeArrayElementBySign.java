class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0, k = 0;
        int[] ans  = new int[n];

        while(k<n){
            while(nums[i] < 0){
                i++;
            }
            while(nums[j] > 0){
                j++;
            }

            if(nums[i] > 0 && nums[j] < 0){
                ans[k] = nums[i];
                k++;
                ans[k] = nums[j];
                k++;
            }
            i++;
            j++;
        }
        

        return ans;
    }

}