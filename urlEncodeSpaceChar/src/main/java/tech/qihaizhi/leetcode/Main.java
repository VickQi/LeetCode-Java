package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String args[]){

        log.info("length={}","        ".length());
        log.info("Start running solution: urlEncodeSpaceChar");
        Solution solution = new Solution();
        String input = "Mr John Smith    ";
        String output = solution.replaceSpaces(input,13);
        log.info("CASE 1 \"{}\" after urlEncoding is:\"{}\"",
                input, output);


        input = "               ";
        output = solution.replaceSpaces(input,5);
        log.info("CASE 2 \"{}\" after urlEncoding is:\"{}\"",
                input, output);    }
}
