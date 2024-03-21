package home.dr.leetcode.addTwoNumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


//    Input: l1 = [2,4,3], l2 = [5,6,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807.
    @Test
    void addTwoNumbers() {
        ListNode ln1 = new ListNode(2, new ListNode(4,new ListNode(3)));
        ListNode ln2 = new ListNode(5, new ListNode(6,new ListNode(4)));


        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(ln1,ln2);
        Assertions.assertArrayEquals(new int[]{7,0,8},new int[]{result.val,result.next.val,result.next.next.val});
    }
//    Input: l1 = [5,6], l2 = [5,4,9]
//    Output: [1,0,1]
//    Expected: [0,1,0,1]
    @Test
    void addTwoNumbers2() {
        ListNode ln1 = new ListNode(5, new ListNode(6));
        ListNode ln2 = new ListNode(5, new ListNode(4,new ListNode(9)));


        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(ln1,ln2);
        Assertions.assertArrayEquals(new int[]{0,1,0,1},new int[]{result.val,result.next.val,result.next.next.val,result.next.next.next.val});
    }
    //    Input: l1 = [9], l2 = [1,9,9,9,9,9,9,9,9,9]
    //    Output:

    @Test
    void addTwoNumbers3() {
        ListNode ln1 = new ListNode(9);
        ListNode ln2 = new ListNode(5, new ListNode(4,new ListNode(9)));


        Solution solution = new Solution();

        ListNode result = solution.addTwoNumbers(ln1,ln2);
        Assertions.assertArrayEquals(new int[]{0,1,0,1},new int[]{result.val,result.next.val,result.next.next.val,result.next.next.next.val});
    }


}