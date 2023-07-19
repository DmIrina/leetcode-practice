package old.task4;

import java.util.Stack;

public class Solution {
    public Stack<Character> checkString(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '#') {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack;
    }

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = checkString(s);
        Stack<Character> stackT = checkString(t);
        return stackS.equals(stackT);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.backspaceCompare("#a#b#", "cd#"));
    }
}
