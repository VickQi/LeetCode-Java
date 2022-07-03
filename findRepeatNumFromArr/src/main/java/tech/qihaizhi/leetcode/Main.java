package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        int[] input = {2, 3, 1, 0, 2, 5, 3};
        Solution solution = new Solution();
        int repeatNum = solution.findRepeatNumber(input);
        log.info("CASE 1 - repeatNum={}", repeatNum);
    }
}
