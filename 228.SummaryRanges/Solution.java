import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(String.valueOf(start));
            }
        }
        return ranges;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 0, 1, 2, 4, 5, 7 };
        System.out.println(solution.summaryRanges(nums));
    }

}
