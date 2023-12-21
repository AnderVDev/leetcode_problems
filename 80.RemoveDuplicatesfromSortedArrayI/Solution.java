import java.util.Arrays;
public class Solution {

    public int removeDuplicates(int[] nums) {
        int writer = 1, counter = 1;
        for (int reader = 1; reader < nums.length; reader++) {

            counter = nums[reader - 1] == nums[reader] ? counter + 1 : 1;
            System.out.println("Counter: " + counter );

            if (counter <= 2) {
                nums[writer++] = nums[reader];
            }
            // System.out.println("Array Status: " + Arrays.toString(nums));
        }
        System.out.println("Result: " + Arrays.toString(nums));
        return writer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        solution.removeDuplicates(nums);
    }
}
