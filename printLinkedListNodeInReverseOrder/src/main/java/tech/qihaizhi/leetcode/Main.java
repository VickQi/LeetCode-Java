package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        log.info("Start running solution printLinkedListNodeInReverseOrder");
        int[] input1 = {1,3,2};
        ListNode head = getLinkedList(input1);
        StackSolution stackSolution = new StackSolution();
        int[] nodeValueArr = stackSolution.reversePrint(head);
        log.info("reversed list is: {}",nodeValueArr);

        int[] input2 = {1,2,3,4,5};
        head = getLinkedList(input2);
        ReverseLinkedListSolution reverseLinkedListSolution = new ReverseLinkedListSolution();
        nodeValueArr = reverseLinkedListSolution.reversePrint(head);
        log.info("reversed list is: {}",nodeValueArr);
    }

    private static ListNode getLinkedList(int[] input) {
        ListNode head = new ListNode(input[0]);
        ListNode cur = head;
        for(int i = 1; i< input.length; i++){
            ListNode listNode = new ListNode(input[i]);
            cur.next = listNode;
            cur = listNode;
        }
        return head;
    }
}
