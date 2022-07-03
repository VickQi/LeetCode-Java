package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        log.info("Start running solution: isIsomorphic");
        Solution solution = new Solution();
        String s = "egg";
        String t = "add";
        boolean result = solution.isIsomorphic(s,t);
        log.info("CASE 1 - \"{}\" and \"{}\" is{} isIsomorphic"
                , s, t, result?"":" not");

        s = "foo";
        t = "bar";
        result = solution.isIsomorphic(s,t);
        log.info("CASE 2 - \"{}\" and \"{}\" is{} isIsomorphic"
                , s, t, result?"":" not");

        s = "paper";
        t = "title";
        result = solution.isIsomorphic(s,t);
        log.info("CASE 3 - \"{}\" and \"{}\" is{} isIsomorphic"
                , s, t, result?"":" not");

        s = "badc";
        t = "baba";
        result = solution.isIsomorphic(s,t);
        log.info("CASE 4 - \"{}\" and \"{}\" is{} isIsomorphic"
                , s, t, result?"":" not");

    }
}
