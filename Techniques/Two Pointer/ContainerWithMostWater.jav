// Approach : Using two pointer both the end and calculate the water filled btw them. then move the pointer from minimum height of lines and again calculate area and store max area. Area = (minimum height * distance btw lines).
// Time Complexity : O(n).
// Space Complexity = O(1).

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int i = 0;
        int j = n-1;
        int Max = 0;
        while(i<j){

            //  Water Area = Min Height x Distance .
            int Tempmax = Math.min(height[i],height[j]) * (j-i);
            if(Tempmax>Max){
                Max = Tempmax;
            }
        
                if(height[i]>height[j]){
                    j--;
                }
                else if(height[i]<height[j]){
                i++;}
                else
                i++;
             }
        return Max;
    }
}