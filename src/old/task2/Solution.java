package old.task2;

import java.util.HashSet;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i: nums) {
            if (hashSet.contains(i)){
                return true;
            }
            hashSet.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[] {1,2,3,1};
        System.out.println(solution.containsDuplicate(arr));
    }
}
