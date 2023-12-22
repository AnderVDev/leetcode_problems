public class Solution {

    public int lengthOfLastWord(String s) {
        int length = 0;
        String input = s.trim();

        int reader = input.length() - 1;
        while(reader >= 0 && input.charAt(reader) != ' '){
            length++;
            reader--;
        }
        return length;
        
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello World ";
        System.out.println(solution.lengthOfLastWord(s));
    }
    
}
