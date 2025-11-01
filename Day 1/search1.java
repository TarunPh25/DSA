class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            // Calculate mid without potential overflow: l + (r - l) / 2
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // Target is in the right half
                l = mid + 1;
            } else {
                // Target is in the left half
                r = mid - 1;
            }
        }
        // Target not found
        return -1;
    }
}

public class search1 {
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Test Case 1: Target found
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        int result1 = solver.search(nums1, target1);
        System.out.println("Input: [-1, 0, 3, 5, 9, 12], Target: " + target1);
        System.out.println("Index of " + target1 + ": " + result1 + " (Expected: 4)\n");

        // Test Case 2: Target not found
        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        int result2 = solver.search(nums2, target2);
        System.out.println("Input: [-1, 0, 3, 5, 9, 12], Target: " + target2);
        System.out.println("Index of " + target2 + ": " + result2 + " (Expected: -1)\n");
        
        // Test Case 3: Target at the beginning
        int[] nums3 = {5};
        int target3 = 5;
        int result3 = solver.search(nums3, target3);
        System.out.println("Input: [5], Target: " + target3);
        System.out.println("Index of " + target3 + ": " + result3 + " (Expected: 0)");
    }
}
