import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int start = nums[0];
        for(int i = 0; i < nums.length; i++ ){
            
        }

        return ranges;        
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,2,4,5,7};
        System.out.println(solution.summaryRanges(nums));
    }

}
