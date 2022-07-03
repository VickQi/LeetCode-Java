package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ReverseLinkedListSolution {

    public int[] reversePrint(ListNode head) {
        ListNode reversedHead = reverseList(head);
        List<Integer> arrayList = new ArrayList<>();
        int length = 0;
        while(reversedHead!=null){
            arrayList.add(reversedHead.val);
            reversedHead = reversedHead.next;
            length++;
        }
        return List2Array(arrayList, length);
    }

    private int[] List2Array(List<Integer> arrayList, int length) {
        int[] reversedList = new int[length];
        int i = 0;
        for(Integer tmp : arrayList){
            reversedList[i] = tmp;
            i++;
        }
        return reversedList;
    }

    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode q = null;
        ListNode reversedHead = null;
        while(p!=null){
            ListNode next = p.next;
            if(next==null){//last node in linked list
                reversedHead = p;
            }
            p.next = q;
            q = p;
            p = next;
        }
        return reversedHead;
    }
}
