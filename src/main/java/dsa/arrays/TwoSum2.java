package dsa.arrays;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target1 = 9;
        System.out.println("Expected output: [1, 2]");
        System.out.println("Actual output:   " + Arrays.toString(twoSum(nums1, target1)));

        System.out.println("-----------");

        int[] nums2 = {2,3,4};
        int target2 = 6;
        System.out.println("Expected output: [1, 3]");
        System.out.println("Actual output:   " + Arrays.toString(twoSum(nums2, target2)));

        System.out.println("-----------");

        int[] nums3 = {-1,0};
        int target3 = -1;
        System.out.println("Expected output: [1, 2]");
        System.out.println("Actual output:   " + Arrays.toString(twoSum(nums3, target3)));
    }

    public static int[] twoSum(int[] nums, int target) {
        // O(n)
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[left] + nums[right] > target) {
                right--;
            }
            if (nums[left] + nums[right] < target) {
                left++;
            }
            if (nums[left] + nums[right] == target) {
                if (left < right) {
                    result[0] = left + 1;
                    result[1] = right + 1;
                }
                if (left > right) {
                    result[0] = right + 1;
                    result[1] = left + 1;
                }
            }
        }
        return result;
    }
}
