public class Solution {

    // public boolean isSubsequence(String s, String t) {
    // boolean result = true;
    // if (s.length() > t.length() || s.length() == 1 && t.indexOf(s.charAt(0)) < 0)
    // {
    // return false;
    // }
    // int prevIndex = 0;
    // for (int reader = 0; reader < s.length() - 1; reader++) {
    // char c = s.charAt(reader);
    // int indexT = t.indexOf(c);
    // System.out.println("Reader: " + reader + " IndexT: " + indexT + " Previous: "
    // + prevIndex);
    // if (indexT == -1 || indexT < prevIndex) {
    // return false;
    // }
    // prevIndex = indexT;
    // }
    // return result;
    // }

    public boolean isSubsequence(String s, String t) {
        int sLength = s.length(), tLength = t.length(), r1 = 0, r2 = 0;

        while (r1 < sLength && r2 < tLength) {
            if (s.charAt(r1) == t.charAt(r2)) {
                r1++;
            }
            r2++;
        }
        return r1 == sLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "acb", t = "ahbgdc";
        // String s = "b", t = "c";
        // String s = "abc", t = "ahbgdc";
        // String s = "axc", t = "ahbgdc";
        System.out.println(solution.isSubsequence(s, t));
    }
}
