import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Optimized approach: Start merging from the end of nums1

        // p1 points to the last element of the initial part of nums1
        int p1 = m - 1;
        // p2 points to the last element of nums2
        int p2 = n - 1;
        // p points to the last position in nums1 where an element should be placed
        int p = m + n - 1;

        // While there are still elements to compare in both arrays
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them to nums1
        // (Elements remaining in nums1 are already in the correct place)
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}

public class mergeSortedArr2 {
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Test Case 1
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        
        System.out.println("Test Case 1:");
        System.out.println("nums1 (before): " + Arrays.toString(nums1_1));
        System.out.println("nums2: " + Arrays.toString(nums2_1));
        
        solver.merge(nums1_1, m1, nums2_1, n1);
        
        System.out.println("nums1 (after):  " + Arrays.toString(nums1_1));
        System.out.println("Expected: [1, 2, 2, 3, 5, 6]\n");

        // Test Case 2
        int[] nums1_2 = {0};
        int m2 = 0;
        int[] nums2_2 = {1};
        int n2 = 1;
        
        System.out.println("Test Case 2:");
        System.out.println("nums1 (before): " + Arrays.toString(nums1_2));
        System.out.println("nums2: " + Arrays.toString(nums2_2));
        
        solver.merge(nums1_2, m2, nums2_2, n2);
        
        System.out.println("nums1 (after):  " + Arrays.toString(nums1_2));
        System.out.println("Expected: [1]");
    }
}
