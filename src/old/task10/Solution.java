package old.task10;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer2 = nums2.length - n;
        for (int i = 0; i < nums1.length; i++) {
            if (pointer2 < nums2.length) {
                if (nums1[i] > nums2[pointer2] || (i > m - 1 && nums1[i] == 0)) {
                    int temp = nums1[i];
                    nums1[i] = nums2[pointer2];
                    nums2[pointer2] = temp;
                }
            }
        }
        if (n != 0) {
            if (nums2[pointer2] == 0) {
                m++;
                n--;
            }
            merge(nums1, m, nums2, n);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
         solution.merge(new int[]{-1,0,0,3,3,3,0,0,0}, 6, new int[]{1,2,2}, 3);
        // solution.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }
}
