package old.task11;

import java.util.Arrays;
import java.util.Hashtable;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int item : nums1) {
            if (hashtable.containsKey(item)) {
                hashtable.replace(item, hashtable.get(item) + 1);
            } else {
                hashtable.put(item, 1);
            }
        }
        int[] arr1 = new int[Math.min(nums1.length, nums2.length)];
        int counter = 0;

        for (int item: nums2) {
            if (hashtable.containsKey(item) && hashtable.get(item) != 0){
                hashtable.replace(item, hashtable.get(item) - 1);
                arr1[counter] = item;
                counter++;
            }
        }

        int[] arr2 = new int[counter];
        System.arraycopy(arr1, 0, arr2, 0, counter);
        return arr2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
       // System.out.println(Arrays.toString(solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(solution.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
