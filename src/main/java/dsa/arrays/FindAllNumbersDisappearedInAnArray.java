package dsa.arrays;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Expected output: [5, 6]");
        System.out.println("Actual output:   " + findDisappearedNumbers(nums1));

        System.out.println("-----------");

        int[] nums2 = {1, 1};
        System.out.println("Expected output: [2]");
        System.out.println("Actual output:   " + findDisappearedNumbers(nums2));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // O(n)
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) set.add(num);
        // set = {1, 2, 3, 4, 7, 8}

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) list.add(i);
        }
        return list;
    }
}
