class Solution {
    public int majorityElement(int[] nums) {
        int val = 0;
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                val = nums[i];
                cnt = 1;
            } else if (nums[i] == val) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return val;
    }
}
public class majorityElement1 {
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Test Case 1
        int[] nums1 = {3, 2, 3};
        int result1 = solver.majorityElement(nums1);
        System.out.println("Input: [3, 2, 3]");
        System.out.println("The majority element is: " + result1);
        
        // Test Case 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int result2 = solver.majorityElement(nums2);
        System.out.println("\nInput: [2, 2, 1, 1, 1, 2, 2]");
        System.out.println("The majority element is: " + result2);
    }
}