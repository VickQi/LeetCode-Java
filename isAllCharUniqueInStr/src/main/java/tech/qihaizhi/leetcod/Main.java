package tech.qihaizhi.leetcod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String args[]){
        log.info("Start running solution: isAllCharUniqueInStr");
        Solution solution = new Solution();
        String input = "leetcode";
        boolean isUniqueFlag = solution.isUnique(input);
        log.info("CASE 1 \"{}\" is {}unique", input, isUniqueFlag?"":"not ");


        input = "abc";
        isUniqueFlag = solution.isUnique(input);
        log.info("CASE 2 \"{}\" is {}unique", input, isUniqueFlag?"":"not ");
    }
}
