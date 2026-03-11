 public int findMin(int[] nums) {
        
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            int mid = low + (high-low)/2;
            
            // for duplicates
            if(nums[mid] == nums[low] && nums[low] == nums[high]){
                low++;
                high--;
                continue;
            }

            if(nums[mid] > nums[high]){
                low = mid+1;
            }
    
            else{
                high = mid;
            }
        }
        return nums[low];
    }
