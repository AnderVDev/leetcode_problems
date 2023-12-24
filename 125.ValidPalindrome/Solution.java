public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        System.out.println(s.toCharArray());
        for (char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                builder.append(Character.toLowerCase(c));
            }
        }
        String filteredString = builder.toString();
        String reverseString = builder.reverse().toString();

        return filteredString.equals(reverseString);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        
        System.out.println(solution.isPalindrome(s));
    }

}
