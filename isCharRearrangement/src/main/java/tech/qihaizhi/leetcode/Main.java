package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String args[]){
        log.info("Start running solution: isCharRearrangement");
        Solution solution = new Solution();
        String str1 = "abc";
        String str2 = "bca";
        boolean isRearrangement = solution.CheckPermutation(str1,str2);
        log.info("CASE 1 \"{}\" is {}character rearrangement of \"{}\"", str1, isRearrangement?"":"not ",str2);

        str1 = "abc";
        str2 = "bad";
        isRearrangement = solution.CheckPermutation(str1,str2);
        log.info("CASE 1 \"{}\" is {}character rearrangement of \"{}\"", str1, isRearrangement?"":"not ",str2);

    }
}
