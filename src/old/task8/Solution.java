package old.task8;

import java.util.Arrays;
import java.util.Hashtable;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            hashtable.put(nums[i], i);
        }

        int[] arr = new int[2];
        int searched;

        for (int i = 0; i < nums.length; i++) {
            searched = target - nums[i];
            if (searched == target / 2 && hashtable.containsKey(searched)) {
                if (hashtable.get(searched) != i) {
                    int k = 0;
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == target / 2) {
                            arr[k] = j;
                            k++;
                        }
                    }
                    return arr;
                }
            } else {
                if (hashtable.containsKey(searched) && (searched != target / 2)) {
                    return new int[]{hashtable.get(nums[i]), hashtable.get(searched)};
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        // System.out.println(Arrays.toString(solution
        //      .twoSum(new int[]{1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1}, 11)));
        System.out.println(Arrays.toString(solution
                .twoSum(new int[]{-10, -1, -18, -19}, -19)));
    }
}
