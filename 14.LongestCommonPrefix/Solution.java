public class Solution {

    // Approach 1: Horizontal scanning
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int index = 1; index < strs.length; index++) {

            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(solution.longestCommonPrefix(strs));
    }

}
