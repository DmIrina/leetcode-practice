package task5;

import java.util.Arrays;

public class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        if (nums.length == 1) {
            return nums;
        }

        while (i < j) {
            while (nums[i] % 2 == 0 && nums[i] != 1 && i < nums.length - 1) {
                i++;
            }
            while ((nums[j] % 2 != 0 || nums[j] == 1) && j > 0) {
                j--;
            }
            if (i < j) {
                swap(nums, i, j);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 3};
        System.out.println(Arrays.toString(solution.sortArrayByParity(arr)));
    }
}
