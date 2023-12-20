import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        // Approach 1: Two Pointers
        int writer = 0;

        for (int reader = 0; reader < nums.length; reader++) {
            if (nums[reader] != val) {
                nums[writer++] = nums[reader];
            }
            // nums[writer] = nums[reader] != val ? nums[reader]: nums[writer];
            System.out.println(Arrays.toString(nums));
            
        }

        // while (reader < nums.length) {
        // if(nums[reader]==val){
        // reader++;
        // }else{
        // nums[writer]=nums[reader];
        // reader++;
        // writer++;

        // }

        // }
        System.out.println("result: "+writer);
        return writer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3; 
        solution.removeElement(nums, val);
    }
}