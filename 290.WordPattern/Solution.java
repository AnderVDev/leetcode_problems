import java.util.HashMap;
import java.util.Map;

public class Solution {

    // HashMap approach

    // public String transformation(String string) {
    // StringBuilder builder = new StringBuilder();
    // String[] words = string.split("\\s+");
    // System.out.println(words.length);
    // if (words.length > 1 ) {
    // Map<String, Integer> mapper = new HashMap<>();
    // for (int index = 0; index < words.length; index++) {
    // String word = words[index];
    // if (!mapper.containsKey(word)) {
    // mapper.put(word, index);
    // }
    // builder.append(mapper.get(word));
    // builder.append("-");
    // System.out.println(builder.toString());
    // }
    // } else {
    // Map<Character, Integer> mapper = new HashMap<>();
    // for (int i = 0; i < string.length(); i++) {
    // char c = string.charAt(i);
    // if (!mapper.containsKey(c)) {
    // mapper.put(c, i);
    // }

    // builder.append(mapper.get(c));
    // builder.append("-");
    // System.out.println(builder.toString());
    // }
    // }
    // return builder.toString();
    // }

    // public boolean wordPattern(String pattern, String s) {
    // String[] words = s.split("\\s+");
    // if(s.length() < pattern.length() || pattern.equals(s) && words.length !=
    // pattern.length()) return false;
    // else if(pattern.toCharArray().length == 1 && words.length == 1 ) return true;
    // String patternT = transformation(pattern);
    // String sT = transformation(s);

    // return patternT.equals(sT);
    // }

    // Fastest approach
    public boolean wordPattern(String pattern, String s) {
        String[] splitted = s.split("\\s+");
        if (pattern.length() != splitted.length)
            return false;
        Map<Character, String> mapper = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = splitted[i];
            if (mapper.containsKey(c) && !mapper.get(c).equals(word) || mapper.containsValue(word) && !mapper.containsKey(c)) {
                return false;
            } 
            mapper.put(c, word);
            System.out.println("Char: " + c + " String: " + word);
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern = "abba", s = "dog cat cat dog";
        // String pattern = "abba", s = "dog cat cat fish";
        // String pattern = "e", s = "eukera";
        // String pattern = "jquery", s = "jquery";
        System.out.println(solution.wordPattern(pattern, s));

    }

}
