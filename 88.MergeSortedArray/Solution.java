import java.util.Arrays;

class Solution {
    // Approach 1: Merge and sort
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    // Approach 2: Three Pointers (Start From the Beginning)
    public void pointers(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m - 1;
        int r2 = n - 1;

        for (int w = (m + n) - 1; w >= 0; w--) {
            if (r1 >= 0 && r2 >= 0) {
                nums1[w] = nums1[m] > nums2[n] ? nums1[r1--] : nums2[r2--];
            } else if (r1 >= 0) {
                nums1[w] = nums1[r1--];
            } else {
                nums1[w] = nums1[r2--];
            }
        }

    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        sol.merge(nums1, m, nums2, n);
    }
}