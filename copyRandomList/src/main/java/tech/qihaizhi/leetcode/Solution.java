package tech.qihaizhi.leetcode;

public class Solution {
    public Node copyRandomList(Node head) {
        Node copiedLinkedList = null;
        while(head!=null){
            if(copiedLinkedList==null){
                copiedLinkedList = new Node(head.val);
            }
            head = head.next;
        }
        return copiedLinkedList;
    }
}
