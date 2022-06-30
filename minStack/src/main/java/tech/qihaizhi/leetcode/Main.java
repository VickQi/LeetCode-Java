package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String args[]){
        log.info("Start running solution: minStack");
        log.info("CASE 1: new MinStack");
        MinStack minStack = new MinStack();
        int ele = -2;
        log.info("CASE 1: push {} into stack", ele);
        minStack.push(ele);
        ele = 0;
        minStack.push(0);
        log.info("CASE 1: push {} into stack", ele);
        ele = -3;
        minStack.push(-3);
        log.info("CASE 1: push {} into stack", ele);
        ele = minStack.min();
        log.info("CASE 1: minimum element of stack is :{}", ele);
        log.info("CASE 1: pop 1 element from stack", ele);
        minStack.pop();
        ele = minStack.top();
        log.info("CASE 1: top element of stack is :{}", ele);
        ele = minStack.min();
        log.info("CASE 1: minimum element of stack is :{}", ele);

        minStack = new MinStack();
        ele = -2;
        log.info("CASE 2: push {} into stack", ele);
        minStack.push(ele);
        ele = 0;
        log.info("CASE 2: push {} into stack", ele);
        minStack.push(ele);
        ele = -1;
        log.info("CASE 2: push {} into stack", ele);
        minStack.push(ele);
        ele = minStack.min();
        log.info("CASE 2: minimum element of stack is :{}", ele);
        ele = minStack.top();
        log.info("CASE 2: top element of stack is :{}", ele);
        log.info("CASE 2: pop 1 element from stack", ele);
        minStack.pop();
        ele = minStack.min();
        log.info("CASE 2: minimum element of stack is :{}", ele);


        minStack = new MinStack();
        ele = 0;
        log.info("CASE 3: push {} into stack", ele);
        minStack.push(ele);
        ele = 1;
        log.info("CASE 3: push {} into stack", ele);
        minStack.push(ele);
        ele = 0;
        log.info("CASE 3: push {} into stack", ele);
        minStack.push(ele);
        ele = minStack.min();
        log.info("CASE 3: minimum element of stack is :{}", ele);
        log.info("CASE 3: pop 1 element from stack", ele);
        minStack.pop();
        ele = minStack.min();
        log.info("CASE 3: minimum element of stack is :{}", ele);
    }
}
