package dsa.arrays;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Expected output: [1, 3, 6, 10]");
        System.out.println("Actual output:   " + Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        // O(n) complexity
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
