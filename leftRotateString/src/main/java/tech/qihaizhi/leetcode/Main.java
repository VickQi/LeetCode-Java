package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        log.info("Start running Solution : leftRotateString");
        StringBuilderSolution stringBuilderSolution = new StringBuilderSolution();
        String input = "abcdefg";
        int k = 2;
        String output = stringBuilderSolution.reverseLeftWords(input, k);
        log.info("CASE 1 - left rotation of \"{}\" at index {} is :{}",
                input , k, output);
        input = "lrloseumgh";
        k = 6;
        output = stringBuilderSolution.reverseLeftWords(input, k);
        log.info("CASE 2 - left rotation of \"{}\" at index {} is :{}",
                input , k, output);

        SubStringSolution subStringSolution = new SubStringSolution();
        input = "abcdefg";
        k = 2;
        output = subStringSolution.reverseLeftWords(input, k);
        log.info("CASE 1 - left rotation of \"{}\" at index {} is :{}",
                input , k, output);
        input = "lrloseumgh";
        k = 6;
        output = subStringSolution.reverseLeftWords(input, k);
        log.info("CASE 2 - left rotation of \"{}\" at index {} is :{}",
                input , k, output);

    }
}
