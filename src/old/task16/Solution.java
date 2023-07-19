package old.task16;

public class Solution {

    // solution for numbers < 9,223,372,036,854,775,807

//    private long getNum(ListNode node) {
//        long num = 0;
//        long counter = 1;
//        while (node != null) {
//            num += ((long) node.val * counter);
//            counter *= 10;
//            node = node.next;
//        }
//        return num;
//    }
//
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        long num1 = getNum(l1);
//        long num2 = getNum(l2);
//        long sum = num1 + num2;
//        int counter = String.valueOf(sum).length();
//        ListNode head = new ListNode();
//        if (counter == 1) {
//            head.val = (int) sum;
//        } else {
//            ListNode current = new ListNode();
//            long res = sum % 10;
//            head.val = (int) res;
//            sum /= 10;
//            head.next = current;
//            counter--;
//            while (counter > 0) {
//                counter--;
//                if (counter != 0){
//                    current.next = new ListNode();
//                }
//                res = sum % 10;
//                current.val = (int) res;
//                current = current.next;
//                sum /= 10;
//            }
//        }
//        return head;
//    }

    private int setValue(ListNode current, int sum) {
        if (sum > 9) {
            current.val = sum % 10;
            return 1;
        } else {
            current.val = sum;
            return 0;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode head = new ListNode();
        int tmp;

        // set value to head
        tmp = setValue(head, curr1.val + curr2.val);

        if ((curr1.next != null || curr2.next != null) || tmp == 1) {
            curr1 = curr1.next;
            curr2 = curr2.next;

            ListNode current = new ListNode();
            head.next = current;

            while (curr1 != null || curr2 != null) {
                if (curr1 == null) {
                    tmp = setValue(current, curr2.val + tmp);
                    curr2 = curr2.next;
                } else if (curr2 == null) {
                    tmp = setValue(current, curr1.val + tmp);
                    curr1 = curr1.next;
                } else {
                    tmp = setValue(current, curr1.val + curr2.val + tmp);
                    curr1 = curr1.next;
                    curr2 = curr2.next;
                }
                if (curr1 != null || curr2 != null || tmp == 1){
                    current.next = new ListNode();
                    current = current.next;
                }
            }
            if (tmp == 1){
                current.val = tmp;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.addTwoNumbers
//                (new ListNode(2, new ListNode(4, new ListNode(3))),
//                        new ListNode(5, new ListNode(6, new ListNode(4)))));
//        System.out.println(solution.addTwoNumbers
//                (new ListNode(9), new ListNode(1,
//                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
//                                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
//                                        new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))))))))));
//        System.out.println(solution.addTwoNumbers(new ListNode(5), new ListNode(5)));
        System.out.println(solution.addTwoNumbers(new ListNode(0), new ListNode(1, new ListNode(8))));
    }
}
