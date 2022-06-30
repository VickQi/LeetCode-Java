package tech.qihaizhi.leetcode;

import java.util.Stack;

public class MinStack {

    private final Stack<Integer> datStack;
    private final Stack<Integer> minStack;

    public MinStack() {
        datStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        datStack.push(val);
        if(minStack.empty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop() {
        int val = datStack.pop();
        if(val==minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return datStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

}
