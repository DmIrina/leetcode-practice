package task18;

public class Solution {

    // solution 1 = works but stores 64-bit integers
//    public int reverse(int x) {
//        int result = 0;
//        if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
//            String digits = String.valueOf(x);
//            String reversedDigits = null;
//            if (digits.charAt(0) == '-') {
//                reversedDigits = "-";
//            }
//            for (int i = digits.length() - 1; i > -1; i--) {
//                if (reversedDigits == null) {
//                    reversedDigits = String.valueOf(digits.charAt(digits.length() - 1));
//                } else {
//                    if (digits.charAt(i) != 0 && digits.charAt(i) != '-') {
//                        reversedDigits += digits.charAt(i);
//                    }
//                }
//            }
//            long k = Long.parseLong(reversedDigits);
//            if (k <= -Math.pow(2, 31) || k >= Math.pow(2, 31) - 1){
//                return 0;
//            }
//            result = (int) k;
//        }
//        return result;
//    }

    // solution 2
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int xDigit = x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && xDigit > 7)) {
                return 0;
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && xDigit < -8)) {
                return 0;
            }
            reversed = reversed * 10 + xDigit;
        }
        return reversed;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.reverse(321));
        // System.out.println(solution.reverse(-320));
        System.out.println(solution.reverse(-1534236469));

    }
}
