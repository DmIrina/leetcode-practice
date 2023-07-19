package old.task19;

public class Solution {
    // solution 1 - works but too long and needs too much memory
//    public int lengthOfLongestSubstring(String s) {
//        int maxResult = 0;
//        int startIndex = 0; // the longest substring start index
//
//        // characters and their indexes + 1
//        // index + 1 - next char after repeated
//        Hashtable<Character, Integer> hashtable = new Hashtable<>();
//
//        for (int endIndex = 0; endIndex < s.toCharArray().length; endIndex++){
//            if (hashtable.containsKey(s.charAt(endIndex))){
//                startIndex = Math.max(startIndex, hashtable.get(s.charAt(endIndex)));
//            }
//            // current length: endIndex - startIndex + 1
//            maxResult = Math.max(maxResult, endIndex - startIndex + 1);
//            hashtable.put(s.charAt(endIndex), endIndex + 1);
//        }
//        return maxResult;
//    }

    // solution 2
    // same way as in solution 1 but int[] instead of hashtable
    // char c = d (d = 100)
    public int lengthOfLongestSubstring(String s) {
        int startIndex = 0;
        int endIndex = 0;
        int maxResult = 0;
        int[] repeated = new int[128];
        while(endIndex < s.length()){
            char c = s.charAt(endIndex);
            if(repeated[c] > 0) {
                startIndex = Math.max(startIndex, repeated[c]);
            }
            maxResult = Math.max(maxResult, endIndex - startIndex + 1);
            repeated[c] = ++endIndex;
        }
        return maxResult;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        // System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        // System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        // System.out.println(solution.lengthOfLongestSubstring("dvdf"));
        System.out.println(solution.lengthOfLongestSubstring("wdfdak"));

    }
}
