package task17;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int counter = 0;
        char s = 0;
        String prefix = "";
        while (true) {
            for (int w = 0; w < strs.length; w++) {
                if (counter >= strs[w].length()) {
                    return prefix;
                } else {
                    if (strs[w].equals(strs[0])) {
                        s = strs[w].charAt(counter);
                    } else {
                        if (strs[w].charAt(counter) != s) {
                            return prefix;
                        }
                    }
                    if (w == strs.length - 1) {
                        prefix += s;
                        counter++;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));
//        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "car", "flow"}));
//        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flight", "flow"}));
    }
}
