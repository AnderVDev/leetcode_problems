import java.util.HashMap;
import java.util.Map;

public class Solution {

    // Simulation Approach

    // public boolean canConstruct(String ransomNote, String magazine) {
    //     for (char c : ransomNote.toCharArray()) {

    //     int index = magazine.indexOf(c);

    //     if (index == -1) {
    //         return false;
    //     }
 
    //     magazine = magazine.substring(0, index) + magazine.substring(index + 1);
    // }
   
    // return true;
    // }

    

    // public boolean canConstruct(String ransomNote, String magazine) {
    //     Map<Character, Integer> magazineMap = new HashMap<>();

    //     for (char i : magazine.toCharArray()) {
    //         magazineMap.put(i, magazineMap.containsKey(i) ? magazineMap.get(i) + 1 : 1);
    //     }

    //     // for (char i : magazineMap.keySet()){
    //     // System.out.println("Key: "+ i + " Counter:" + magazineMap.get(i));
    //     // }

    //     for (char c : ransomNote.toCharArray()) {
    //         if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
    //             return false;
    //         }
    //         magazineMap.put(c, magazineMap.get(c) - 1);
    //     }

    //     return true;
    // }


    public Map<Character, Integer> counterMap(String string){
        Map<Character, Integer> map = new HashMap<>();

        for (char c : string.toCharArray()) {
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }
        return map;
    }


    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magazineMap = counterMap(magazine);

        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // String ransomNote = "aa", magazine = "aab";
        // String ransomNote = "a", magazine = "b";
        // String ransomNote = "aa", magazine = "ab";
        String ransomNote = "aab", magazine = "baa";
        System.out.println(solution.canConstruct(ransomNote, magazine));
    }

}
