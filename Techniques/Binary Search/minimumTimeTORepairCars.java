
// Approach : 1. Binary search on minimum time .
// 2. Limit low = 1 and high = minimum ranks ka worker saari car wash kar dega
// 3. calculate ke liye nested loop ki jgh equation me convert karo and Math.sqrt use karo 
// Edge Case : Type conversion ka dhiyan overflow ko handle karo
// Time Complexity : minimum function => O(n)  && binary search => O(n log(cars))  && calculate function => O(n).
// Time Complexity = O(n log(cars)).
// Space Complexity = O(1).

class Solution {
    // Find Minimum Ranks Of Mechanic
    public long minimum(int[] ranks){
        int n = ranks.length;
        long mini = ranks[0];
        for(int i = 1; i<n; i++){
            if(ranks[i] < mini){
                mini = ranks[i];
            }
        }
        return mini;
    }
    // Calculate car washed by every worker
    public boolean calculate(int[] ranks, int cars , long mid){
        int n = ranks.length;
        long totalCars = 0;                         // avoid overflow
        for(int i = 0; i<n; i++){
            double car = Math.sqrt((double)(mid/ranks[i]));         // Math.sqrt double return type 
            totalCars += (long)car;
        }
        if(totalCars >= cars){
            return true;
        }
        else return false;


    }
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long low = 1;
        // handle over flow by cars convert in long before multiple
        long high = minimum(ranks) * ((long)cars * (long)cars);
        long ans = -1;

        while(low<=high){
            long mid = low + (high-low)/2;

            // if cars washes then store and check for minimum
            if(calculate(ranks,cars,mid)){
                ans = mid;
                high = mid -1;
            }

            // increase mid car are not washed
            else low = mid + 1;
        }

        return ans;
        
    }
}