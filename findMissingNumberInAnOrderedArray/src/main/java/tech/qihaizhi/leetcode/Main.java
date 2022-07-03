package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        log.info("Start running solution findMissingNumberInAnOrderedArray");
        Solution solution = new Solution();
        int[] input1 = {0,1,3};
        int missingValue = solution.missingNumber(input1);
        log.info("CASE 1 - missing value of {} is: {}", input1, missingValue);

        int[] input2 = {0,1,2,3,4,5,6,7,9};
        missingValue = solution.missingNumber(input2);
        log.info("CASE 2 - missing value of {} is: {}", input2, missingValue);

    }
}
