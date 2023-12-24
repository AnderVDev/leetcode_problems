class Solution {
    public int strStr(String haystack, String needle) {

        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "sadbutsad", needle = "sad";
        String haystack = "leetcode", needle = "leeto";
        System.out.println(solution.strStr(haystack, needle));
    }
}