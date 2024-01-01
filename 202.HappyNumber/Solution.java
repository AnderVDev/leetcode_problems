import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int nextValue(int n) {
        int total = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            total += d * d;
        }
        System.out.println(total);
        return total;
    }

    public boolean isHappy(int n) {
        Set<Integer> values = new HashSet<>();
        int num = n;

        while (num != 1) {
            if (values.contains(num)) {
                return false;
            }
            values.add(num);
            num = nextValue(num);
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 19;
        System.out.println(solution.isHappy(n));
    }

}
