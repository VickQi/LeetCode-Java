package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String args[]){
        log.info("Start running solution: findPivotIndexOfArray");
        Solution solution = new Solution();
        int input1[] = {1,7,3,6,5,6};
        log.info("CASE 1: input:{}",input1);
        log.info("CASE 1: output:{}", solution.pivotIndex(input1));
        int input2[] = {1,2,3};
        log.info("CASE 2: input:{}",input2);
        log.info("CASE 2: output:{}", solution.pivotIndex(input2));
        int input3[] = {2,1,-1};
        log.info("CASE 3: input:{}",input3);
        log.info("CASE 3: output:{}", solution.pivotIndex(input3));

    }
}
