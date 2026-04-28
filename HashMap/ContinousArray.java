// Flow :
// 1. saare 0 ko -1 ki trh treat karo 
// 2. HAshMap banao prefix sum and index ka 
// 3. map me already {0,-1} i.e 0 sum pe index-1 h necessary
// 4. jha bhi prefix sum map me mila i.e vha subaaray 0 hua iska mtlb no. of 0 and 1 equal so vha se lenght nikal lo 
// 5. map me sirf tb put karenge jb vo pehli baar sum ayega bcz first occurence chahiye for maxLength




class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();                 // sum - index HashMap
        map.put(0,-1);               // intially sum 0 ans vo 1 baar aya h (!!! important)
        int sum = 0;
        int maxLength = 0;

        for(int i = 0; i<n; i++){

            // treat 0 as a -1
            if(nums[i] == 0){
                nums[i] = -1;
            }
            // prefix sum 
            sum += nums[i];

            if(map.containsKey(sum)){
                int length = i - map.get(sum);
                maxLength = Math.max(length , maxLength);
            }
            else {
                map.put(sum,i);
            }
        }

        return maxLength;
    }
}