package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        log.info("Start running Solution getNumberOccurTimesInAnOrderedArray");
        int[] input = {5,7,7,8,8,10};
        int target = 8;
        Solution solution = new Solution();
        int occurTimes = solution.search(input,target);
        log.info("{} occurs {} times in array:{}", target, occurTimes, input);

        target = 6;
        occurTimes = solution.search(input,target);
        log.info("{} occurs {} times in array:{}", target, occurTimes, input);
    }
}
