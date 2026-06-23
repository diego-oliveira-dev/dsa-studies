package dsa.arrays;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 10};
        System.out.println("Expected output: [0, 1, 9, 16, 100]");
        System.out.println("Actual output:   " + Arrays.toString(sortedSquares(nums1)));

        System.out.println("-----------");

        int[] nums2 = {-7, -3, 2, 3, 11};
        System.out.println("Expected output: [4, 9, 9, 49, 121]");
        System.out.println("Actual output:   " + Arrays.toString(sortedSquares(nums2)));
    }

    public static int[] sortedSquares(int[] nums) {
        /*
        1st solution -> O(n log n)
        - calculate the square of each element
        - sort it
        */
//        return Arrays.stream(nums)
//                .map(num -> (int) Math.pow(num, 2)) // O(n*1) == O(n)
//                .sorted() // O(n log n)
//                .toArray();

        /*
        2nd solution -> O(n), but does not always work
        */

//        nums = Arrays.stream(nums).map(num -> (int) Math.pow(num, 2)).toArray();
//        for (int i = nums.length - 1; i > 0; i--) {
//            if (nums[0] > nums[i]) {
//                int temp = nums[0];
//                nums[0] = nums[i];
//                nums[i] = temp;
//            }
//        }
//        return nums;
        /*
        3rd solution -> O(n) but actually works
        */
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int rightSquare = nums[right] * nums[right] ;
            int leftSquare = nums[left] * nums[left] ;
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            }
            if (rightSquare > leftSquare || rightSquare == leftSquare) {
                result[i] = rightSquare;
                right--;
            }
        }
        return result;
    }
}
