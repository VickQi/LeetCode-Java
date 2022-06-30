package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String args[]){
        log.info("Start running solution: runningSum");
        Solution solution = new Solution();
        int input1[] = {1,2,3,4};
        log.info("CASE 1: input:{}",input1);
        log.info("CASE 1: output:{}", solution.runningSum(input1));
        int input2[] = {1,1,1,1,1};
        log.info("CASE 2: input:{}",input2);
        log.info("CASE 2: output:{}", solution.runningSum(input2));
        int input3[] = {3,1,2,10,1};
        log.info("CASE 3: input:{}",input3);
        log.info("CASE 3: output:{}", solution.runningSum(input3));

    }

}
