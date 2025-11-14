class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}

public class searchInsert1 {
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Test Case 1: Target found in array
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int result1 = solver.searchInsert(nums1, target1);
        System.out.println("Input: {1, 3, 5, 6}, Target: " + target1);
        System.out.println("Insert Index: " + result1 + " (Expected: 2)\n");

        // Test Case 2: Target not found, insert at the beginning
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 0;
        int result2 = solver.searchInsert(nums2, target2);
        System.out.println("Input: {1, 3, 5, 6}, Target: " + target2);
        System.out.println("Insert Index: " + result2 + " (Expected: 0)\n");

        // Test Case 3: Target not found, insert in the middle
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 2;
        int result3 = solver.searchInsert(nums3, target3);
        System.out.println("Input: {1, 3, 5, 6}, Target: " + target3);
        System.out.println("Insert Index: " + result3 + " (Expected: 1)\n");

        // Test Case 4: Target not found, insert at the end
        int[] nums4 = {1, 3, 5, 6};
        int target4 = 7;
        int result4 = solver.searchInsert(nums4, target4);
        System.out.println("Input: {1, 3, 5, 6}, Target: " + target4);
        System.out.println("Insert Index: " + result4 + " (Expected: 4)");
    }
}