package stairClimbing.fibonacci;

public class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int firstStair = 1;
        int secondStair = 2;
        int nextStair;
        for (int i = 3; i < n + 1; i++) {
            nextStair = firstStair + secondStair;
            firstStair = secondStair;
            secondStair = nextStair;
        }
        return secondStair;
    }
}
