package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        log.info("Start running solution isSubString!");
        Solution solution = new Solution();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = solution.isSubsequence(s,t);
        log.info("CASE 1 - \"{}\" is{} sub string of \"{}\"", s,result?"":" not", t);

        s = "axc";
        t = "ahbgdc";
        result = solution.isSubsequence(s,t);
        log.info("CASE 2 - \"{}\" is{} sub string of \"{}\"", s,result?"":" not", t);

        s = "b";
        t = "c";
        result = solution.isSubsequence(s,t);
        log.info("CASE 3 - \"{}\" is{} sub string of \"{}\"", s,result?"":" not", t);

        s = "aaaaaa";
        t = "bbaaaa";
        result = solution.isSubsequence(s,t);
        log.info("CASE 4 - \"{}\" is{} sub string of \"{}\"", s,result?"":" not", t);

    }
}
