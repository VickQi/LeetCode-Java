package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String args[]){
        log.info("Start running solution: buildQueueWith2Stack");
        log.info("CASE 1: new a queue");
        CQueue cQueue = new CQueue();
        int ele = 3;
        log.info("CASE 1: append {} to the tail",ele);
        cQueue.appendTail(ele);
        ele = cQueue.deleteHead();
        log.info("CASE 1: delete one element from head, the element is: {}", ele);
        ele = cQueue.deleteHead();
        log.info("CASE 1: delete one element from head, the element is: {}", ele);


        log.info("CASE 2: new a queue");
        cQueue = new CQueue();
        ele = cQueue.deleteHead();
        log.info("CASE 2: delete one element from head, the element is: {}", ele);
        ele = 5;
        log.info("CASE 2 append {} to the tail",ele);
        cQueue.appendTail(ele);
        ele = 2;
        log.info("CASE 2 append {} to the tail",ele);
        cQueue.appendTail(ele);
        ele = cQueue.deleteHead();
        log.info("CASE 2: delete one element from head, the element is: {}", ele);
        ele = cQueue.deleteHead();
        log.info("CASE 2: delete one element from head, the element is: {}", ele);
    }

}
