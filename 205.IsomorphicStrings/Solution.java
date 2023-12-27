import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Map<Character, Integer> mapper(String string){
         Map<Character, Integer> mapper = new HashMap<>();
         for(char c : string.toCharArray()){
            mapper.put(c, mapper.containsKey(c) ? mapper.get(c)+1  : 1);
         }
         return mapper;

    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> sMap = mapper(s);
        Map<Character, Integer> tMap = mapper(t);
        int sWeight=0, tWeight=0;

        for(char c : s.toCharArray()){
            sWeight += sMap.get(c);
            System.out.println("Key: " + c + " Counter: " + sMap.get(c));
        }
        for(char c : t.toCharArray()){
            tWeight += tMap.get(c);
            System.out.println("Key: " + c + " Counter: " + tMap.get(c));
        }
        System.out.println("SW: " + sWeight + " TW: " + tWeight);
       
        return tWeight == sWeight;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // String s = "egg", t = "add";
        // String s = "foo", t = "bar";
        String s = "paper", t = "title";
        System.out.println(solution.isIsomorphic(s, t));
    }

}
