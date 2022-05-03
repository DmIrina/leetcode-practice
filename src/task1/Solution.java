package task1;

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : b) {
            if (hashMap.containsKey(c)) {
                hashMap.replace(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (char c : a) {
            if (hashMap.containsKey(c) && hashMap.get(c) != 0) {
                hashMap.replace(c, hashMap.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canConstruct("gama", "magazine"));
    }
}
