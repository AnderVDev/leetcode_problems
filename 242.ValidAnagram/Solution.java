import java.util.Arrays;

public class Solution {

    // public boolean isAnagram(String s, String t) {
    //     if(s.length() != t.length()) return false;
    //     Map<Character, Integer> sMap = counterMap(s);
    //     Map<Character, Integer> tMap = counterMap(t);
    //     for(char c : sMap.keySet()){
    //         if(!tMap.containsKey(c) || sMap.get(c) != tMap.get(c)){
    //             return false;
    //         }
    //     }
    //     return true;        
    // }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
                
        return Arrays.equals(sArray, tArray);        
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        System.out.println(solution.isAnagram(s, t));

    }
    
}
