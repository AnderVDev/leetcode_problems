import java.util.Arrays;
// import java.util.HashMap;

public class Solution {
    // Approach 1: Brute Force
    // public int majorityElement(int[] nums) {
    // int majority = nums.length / 2;
    // for (int num : nums) {
    // int counter = 0;
    // for (int currentValue : nums) {
    // if (num == currentValue)
    // counter++;

    // }
    // if (counter > majority)
    // return num;
    // }
    // return -1;
    // }

    // Approach 2: HashMap
    // private HashMap<Integer, Integer> countNums(int[] nums) {
    //     HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
    //     for (int num : nums) {
    //         counts.put(num, !counts.containsKey(num) ? 1 : counts.get(num) + 1);
    //     }
    //     return counts;
    // }

    // public int majorityElement(int[] nums) {
    //     HashMap<Integer, Integer> counts = countNums(nums);
    //     for (int key : counts.keySet()) {
    //         if (counts.get(key) > nums.length / 2)
    //             return key;
    //     }
    //     return -1;
    // }

    // Approach 3: Sorting
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // int [] nums = {3,2,3};
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int sol = solution.majorityElement(nums);
        System.out.println(sol);
    }

}
