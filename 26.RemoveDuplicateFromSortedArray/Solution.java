public class Solution {
    public int removeDuplicates(int[] nums) {
        int writer = 1;
        for (int reader = 1; reader < nums.length; reader++) {
            if (nums[reader - 1] != nums[reader]) {
                nums[writer++] = nums[reader];
            }
        }
        return writer;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1,2};
        solution.removeDuplicates(nums);
    }

}
