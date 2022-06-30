package tech.qihaizhi.leetcode;

import java.util.Stack;

public class CQueueFlipOnAppendAndDeletion {

    private final Stack<Integer> tailStack;
    private final Stack<Integer> headStack;

    public CQueueFlipOnAppendAndDeletion() {
        tailStack = new Stack<>();
        headStack = new Stack<>();
    }

    public void appendTail(int value) {
        while(!headStack.empty()){
            Integer popValue = headStack.pop();
            tailStack.push(popValue);
        }
        tailStack.push(value);
    }

    public int deleteHead() {
        while(!tailStack.empty()){
            Integer popValue = tailStack.pop();
            headStack.push(popValue);
        }
        if(headStack.empty()){
            return -1;
        }else{
            return headStack.pop();
        }
    }
}
