package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        log.info("Start running solution nextGreaterNumber");
        Solution solution = new Solution();
        int n = 12;
        int nextGreater = solution.nextGreaterElement(n);
        log.info("CASE 1 - next greater number of {} is: {}", n, nextGreater);

        n = 21;
        nextGreater = solution.nextGreaterElement(n);
        log.info("CASE 2 - next greater number of {} is: {}", n, nextGreater);

        n = 1234;
        nextGreater = solution.nextGreaterElement(n);
        log.info("CASE 3 - next greater number of {} is: {}", n, nextGreater);

        n = 230241;
        nextGreater = solution.nextGreaterElement(n);
        log.info("CASE 4 - next greater number of {} is: {}", n, nextGreater);
    }
}
