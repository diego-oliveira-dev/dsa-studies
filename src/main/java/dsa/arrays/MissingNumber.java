package dsa.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println("Expected output: 2");
        System.out.println("Actual output:   " + missingNumber(nums1));

        System.out.println("-----------");

        int[] nums2 = {0, 1};
        System.out.println("Expected output: 2");
        System.out.println("Actual output:   " + missingNumber(nums2));

        System.out.println("-----------");

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Expected output: 8");
        System.out.println("Actual output:   " + missingNumber(nums3));

    }

    public static int missingNumber(int[] nums) {
        // BRUTE FORCE: O(n²)
//        for (int i = 0; i <= nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[j] == i) break;
//                if ((nums[j] != i) && (j == nums.length - 1)) return i;
//            }
//        }

        // O(n log n)
//        int[] numsArray = Arrays.stream(nums).sorted().toArray();
//        for (int i = 0; i <= numsArray.length; i++) {
//            if (i == numsArray.length) return i;
//            if (numsArray[i] != i) return i;
//        }

        // sum approach: O(n)
        // for {3, 0, 1}:
        // from 0 to 3, the sum should be 0 + 1 + 2 + 3 = 6, but 2 is missing
        // to calculate the sum of n numbers: n * (n + 1) / 2
        // n = length of the array, so n = nums.length
        // use the same formula to calculate the actual sum
        // if you do expected sum - actual sum, you get the missing element (2)
//        int expected = nums.length * (nums.length + 1) / 2;
//        int actual = 0;
//        for (int num : nums) {
//            actual += num;
//        }
//        return expected - actual;

        // XOR approach: O(n)
        // for {0, 1} (this one is confusing)
        // it revolves around the bitwise operation XOR
        // XOR compare the bits from two numbers:
        // - if the bits are equal, it returns 0
        // - if they're different, returns 1
        // by using it, we're basically creating an expression that does;
        // - numbers that appears twice disappear (because a ^ a = 0)
        // - numbers that appears once stand out (because a ^ 0 = a)
        // in that expression, we use the expected array by getting the index inside
        // a for loop and the length outside of it (to avoid index out of bounds)
        // we also use the actual array by getting its value
        int result = nums.length;
        // getting 2 because we cannot get it inside the loop,
        // it would throw an index out of bounds exception
        for (int i = 0; i < nums.length; i++) {
            result ^= i; // getting the expected array {0, 1, 2}
            // 2 was caught outside of the for loop

            result ^= nums[i]; // getting the actual array {0, 1}
        }
        return result; // the remaining value is the missing number
    }
}
