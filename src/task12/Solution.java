package task12;

public class Solution {
    private void fillMatrix(int[][] matrix, int n, String s) {
        int i;
        int j;
        for (int l = 1; l < n + 1; l++) {
            i = 0;
            j = i + l - 1;
            while (j < n) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else if (s.charAt(i) == s.charAt(j)) {
                    matrix[i][j] = matrix[i + 1][j - 1] + 2;
                } else {
                    matrix[i][j] = Math.max(matrix[i + 1][j], matrix[i][j - 1]);
                }
                i++;
                j++;
            }
        }
    }

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] matrix = new int[n][n];
        fillMatrix(matrix, n, s);
        return matrix[0][n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
       // System.out.println(solution.longestPalindromeSubseq("bbbab"));
        System.out.println(solution.longestPalindromeSubseq("cbbd"));
    }
}
