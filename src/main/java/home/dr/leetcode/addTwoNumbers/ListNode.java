package home.dr.leetcode.addTwoNumbers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for singly-linked list.
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder sl1 = new StringBuilder();
        StringBuilder sl2 = new StringBuilder();

        ListNode currentNode = l1;
        do {
            sl1.insert(0, currentNode.val);
            currentNode = currentNode.next;
        } while (null != currentNode);

        currentNode = l2;
        do {
            sl2.insert(0, currentNode.val);
            currentNode = currentNode.next;
        } while (null != currentNode);

        BigDecimal resultInt = new BigDecimal(sl1.toString()).add(new BigDecimal(sl2.toString()));

        StringBuilder reverse = new StringBuilder(String.valueOf(resultInt)).reverse();
        char[] charArray = reverse.toString().toCharArray();

        ListNode[] listNodes = new ListNode[charArray.length];
        for (int i = 0; i < listNodes.length; i++) {
            listNodes[i] = new ListNode();
        }

        for (int i = 0; i < charArray.length; i++) {
            String s = String.valueOf(charArray[i]);
            listNodes[i].val=Integer.parseInt(s);
            if(i<charArray.length-1){
                listNodes[i].next = listNodes[i+1];
            }
        }


        return listNodes[0];
    }

}
