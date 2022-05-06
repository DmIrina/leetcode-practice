package task9;

class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                unique++;
                if (i != 0) {
                    nums[unique] = nums[i + 1];
                }
            }
        }
        unique++;
        for (int j = unique; j < nums.length; j++) {
            nums[j] = 0;
        }
        return unique;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(new int[]{0, 0, 0, 0, 0, 1, 2, 2, 3, 3, 4, 4}));
    }
}
