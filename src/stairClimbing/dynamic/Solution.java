package stairClimbing.dynamic;

public class Solution {
    public int climbStairs(int n) {
        return climb(n);
    }

    private int climb(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] stair = new int[n + 1];
        stair[1] = 1;
        stair[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            stair[i] = stair[i-1] + stair[i-2];
        }
        return stair[n];
    }
}
