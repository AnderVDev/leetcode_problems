public class Solution {

    public int majorityElement(int[] nums) {
        int majority = nums.length / 2;
        for (int num : nums) {
            int counter = 0;
            for (int currentValue : nums) {
                if (num == currentValue)
                    counter++;

            }
            if (counter > majority)
                return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // int [] nums = {3,2,3};
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int sol = solution.majorityElement(nums);
        System.out.println(sol);
    }

}
