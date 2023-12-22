import java.util.HashMap;
import java.util.Map;

public class Solution {
    // Approach 1: Left-to-Right Pass
    // public int romanToInt(String s) {
    // Map<String, Integer> values = new HashMap<>();
    // values.put("M", 1000);
    // values.put("D", 500);
    // values.put("C", 100);
    // values.put("L", 50);
    // values.put("X", 10);
    // values.put("V", 5);
    // values.put("I", 1);

    // int add = 0;
    // int reader = 0;
    // String input = s.toUpperCase();
    // String currentString;
    // while (reader < s.length()) {

    // currentString = input.substring(reader, reader + 1);
    // int currentValue = values.get(currentString);
    // int nextValue = 0;
    // if (reader + 1 < input.length()) {
    // String nextString = input.substring(reader + 1, reader + 2);
    // nextValue = values.get(nextString);
    // }
    // add += nextValue > currentValue ? nextValue - currentValue : currentValue;
    // reader += nextValue > currentValue ? 2 : 1;
    // }
    // return add;
    // }

    // Approach 2: Right-to-left Pass
    public int romanToInt(String s) {
        Map<String, Integer> values = new HashMap<>();
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);

        int lastValue = values.get(s.substring(s.length() - 1));
        int total = lastValue;

        for (int reader = s.length() - 2; reader >= 0; reader--) {
            String currentString = s.substring(reader, reader + 1);
            int currentValue = values.get(currentString);
            total = currentValue < lastValue ? total - currentValue : total + currentValue;
            lastValue = currentValue;
        }
        return total;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = "XXI";
        int answer = solution.romanToInt(string);
        System.out.println(answer);
    }

}
