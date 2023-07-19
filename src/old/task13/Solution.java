package old.task13;

public class Solution {

    // solution 1
    // space = O(1), time = O(n^2)

    private String findTheLongest(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 1) {
            return s;
        }

        String longest = s.substring(0, 1);
        String tmp;

        for (int i = 0; i < s.length(); i++) {
            tmp = findTheLongest(s, i, i);
            if (longest.length() < tmp.length()) {
                longest = tmp;
            }

            tmp = findTheLongest(s, i, i + 1);
            if (longest.length() < tmp.length()) {
                longest = tmp;
            }
        }

        return longest;
    }


    // solution 2
    // space = O(n^2), time = O(n^2)

//    private String fillTheMatrix(String s, boolean[][] matrix, int n, int maxL) {
//        int i;
//        int j;
//        String longest = null;
//        for (int l = 1; l < n + 1; l++) {
//            i = 0;
//            j = i + l - 1;
//            while (j < n) {
//                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || matrix[i + 1][j - 1])) {
//                    matrix[i][j] = true;
//                    if (j - i + 1 >= maxL) {
//                        maxL = j - i + 1;
//                        longest = s.substring(i, j + 1);
//                    }
//                }
//                i++;
//                j++;
//            }
//        }
//        return longest;
//    }
//
//    public String longestPalindrome(String s) {
//        if (s == null || s.length() == 1)
//            return s;
//        int n = s.length();
//        int maxL = 1;
//        boolean[][] matrix = new boolean[n][n];
//        return fillTheMatrix(s, matrix, n, maxL);
//    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("ac"));
        //  System.out.println(solution.longestPalindrome("babad"));
    }

}
