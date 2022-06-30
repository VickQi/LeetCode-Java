package tech.qihaizhi.leetcode;

import java.util.Stack;

public class CQueue {

    private final Stack<Integer> tailStack;
    private final Stack<Integer> headStack;

    public CQueue() {
        tailStack = new Stack<>();
        headStack = new Stack<>();
    }

    public void appendTail(int value) {
        tailStack.push(value);
    }

    public int deleteHead() {
        if(headStack.empty()){
            if(tailStack.empty()){
                return -1;
            }
            while(!tailStack.empty()){
                Integer popValue = tailStack.pop();
                headStack.push(popValue);
            }
        }
        return headStack.pop();
    }
}
