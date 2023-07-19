package old.task6;

class Solution {
//    private int findSumInArray(int[] arr, int a, int b) {
//        int sum = 0;
//        for (int i = a; i < b + 1; i++) {
//            sum += arr[i];
//        }
//        return sum;
//    }
//
//    public int maxSubArray(int[] nums) {
//        int maxSum = Integer.MIN_VALUE;
//        int iMax = 0;
//        int jMax = 0;
//        for (int i = 0; i < nums.length; i++){
//            int j = i;
//            while (j < nums.length){
//                if (findSumInArray(nums, i, j) > maxSum){
//                    iMax = i;
//                    jMax = j;
//                    maxSum = findSumInArray(nums, i, j);
//                }
//                j++;
//            }
//        }
//        return findSumInArray(nums, iMax, jMax);
//    }

    private static int finder(int i, int j, int[] nums) {
        if (i == j) {
            return nums[i];
        }

        int leftCross = Integer.MIN_VALUE;
        int rightCross = Integer.MIN_VALUE;
        int mid = (i + j) / 2;
        int sum = 0;

        for (int k = mid; k >= i; k--) {
            sum += nums[k];
            leftCross = Math.max(sum, leftCross);
        }

        sum = 0;
        for (int k = mid + 1; k <= j; k++) {
            sum += nums[k];
            rightCross = Math.max(sum, rightCross);
        }

        int crossSum = rightCross + leftCross;
        int leftSum = finder(i, mid, nums);
        int rightSum = finder(mid + 1, j, nums);
        return Math.max(crossSum, Math.max(leftSum, rightSum));
    }

    public int maxSubArray(int[] nums) {
        return finder(0, nums.length - 1, nums);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{-1, 7, -6, 8};
        System.out.println(solution.maxSubArray(arr));
    }
}
