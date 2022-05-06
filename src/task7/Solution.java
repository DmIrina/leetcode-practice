package task7;

import java.util.Arrays;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        current = head;
        int mid = length / 2;
        for (int i = 0; i < mid; i++) {
            stack.push(current.val);
            current = current.next;
        }
        if (length % 2 != 0) {
            current = current.next;
        }
            if (!stack.empty()) {
                while (current != null) {
                    if (stack.peek() == current.val) {
                        stack.pop();
                        current = current.next;
                    } else {
                        return false;
                    }
                }
            }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
         ListNode l = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        //ListNode l = new ListNode(1);
       // ListNode l = new ListNode(1, new ListNode(0, new ListNode(1)));
        System.out.println(solution.isPalindrome(l));
    }
}
