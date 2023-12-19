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

    // Approach 2: Three Pointers (Start From the Beginning)(OPTIMAL SOLUTION)
    public void pointers(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        for (int w = (m + n) - 1; w >= 0; w--) {
            if (p2 < 0) {
                break;
            }
            nums1[w] = p1 >= 0 && p2 >= 0 && (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
            System.out.println("Array Status: " + Arrays.toString(nums1) + " Pointer 1: " + p1 + " Pointer 2: " + p2);
        }
        System.out.println("Result: " + Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        solution.pointers(nums1, m, nums2, n);
    }
}