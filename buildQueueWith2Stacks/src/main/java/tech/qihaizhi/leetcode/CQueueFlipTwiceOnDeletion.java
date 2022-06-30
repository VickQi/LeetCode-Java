package tech.qihaizhi.leetcode;

import java.util.Stack;

public class CQueueFlipTwiceOnDeletion {

    private final Stack<Integer> tailStack;
    private final Stack<Integer> headStack;

    public CQueueFlipTwiceOnDeletion() {
        tailStack = new Stack<>();
        headStack = new Stack<>();
    }

    public void appendTail(int value) {
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
            Integer headValue = headStack.pop();
            while(!headStack.empty()){
                Integer popValue = headStack.pop();
                tailStack.push(popValue);
            }
            return headValue;
        }
    }
}
