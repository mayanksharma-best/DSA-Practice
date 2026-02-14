// Problem: Remove Element
// Time: O(n)
// Space: O(1)

/*
Example:
nums = [3,2,2,3], val = 3

After removeElement:
return = 2
nums = [2,2,_,_]
*/

class removeElement {

    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;

        while (i < nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}
