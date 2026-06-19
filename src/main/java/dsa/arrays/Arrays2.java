package dsa.arrays;

import java.util.Arrays;

public class Arrays2 {
    // Leetcode 1929. Concatenation of Array
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println("Expected output: [1, 2, 1, 1, 2, 1]");
        System.out.println("Actual output:   " + Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        // O(n) complexity
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < ans.length / 2; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
