package dsa.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Expected output: true");
        System.out.println("Actual output:   " + containsDuplicate(nums1));

        System.out.println("-----------");

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Expected output: false");
        System.out.println("Actual output:   " + containsDuplicate(nums2));

    }

    public static boolean containsDuplicate(int[] nums) {
        // O(n) complexity
        Set<Integer> numsSet = new LinkedHashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        return (numsSet.size() != nums.length);

        // BRUTE FORCE: O(n²) complexity
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) return true;
//            }
//        }
//        return false;
    }
}
