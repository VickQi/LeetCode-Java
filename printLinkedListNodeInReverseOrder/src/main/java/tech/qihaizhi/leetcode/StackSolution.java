package tech.qihaizhi.leetcode;

import java.util.Stack;

public class StackSolution {

    private Stack<Integer> stack;

    public int[] reversePrint(ListNode head) {
        stack = new Stack<>();
        int length = 0;
        ListNode listNode = head;
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
            length++;
        }
        int[] reversedList = new int[length];
        int i = 0;
        while (!stack.empty()){
            reversedList[i] = stack.pop();
            i++;
        }
        return reversedList;
    }
}
