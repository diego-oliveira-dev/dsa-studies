package dsa.arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Expected output: 5");
        System.out.println("Actual output:   " + maxProfit(nums1));

        System.out.println("-----------");

        int[] nums2 = {7, 6, 4, 3, 1};
        System.out.println("Expected output: 0");
        System.out.println("Actual output:   " + maxProfit(nums2));
    }

    /*
    * Solution:
        - add it to set and order it
        - get the first (smallest element)
        - cut the array after the smallest element position
        - get the new array, sort it, get the greatest (latest)
    * */
    public static int maxProfit(int[] prices) {
        // BRUTE FORCE: O(n log n)
//        List<Integer> list = new ArrayList<>();
//        for (int price : prices) list.add(price);
//        list.sort(Integer::compareTo);
//        Integer buy = list.getFirst();
//        int smallestIndex = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] == buy) {
//                smallestIndex = i;
//            }
//        }
//        List<Integer> subList = new ArrayList<>();
//        for (int i = smallestIndex; i < prices.length; i++) {
//            subList.add(prices[i]);
//        }
//        subList.sort(Integer::compareTo);
//        Integer sell = subList.getLast();
//        return sell - buy;

        // O(n)
        // prices = {7, 1, 5, 3, 6, 4}
        int smallest = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            smallest = Math.min(smallest, price);
            maxProfit = Math.max(maxProfit, price - smallest);
        }
        return maxProfit;
    }
}
