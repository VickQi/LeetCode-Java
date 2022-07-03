package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args){
        log.info("Start running solution: urlEncodeSpaceChar-StringBuilderSolution");
        StringBuilderSolution stringBuilderSolution = new StringBuilderSolution();
        String input = "Mr John Smith    ";
        String output = stringBuilderSolution.replaceSpaces(input,13);
        log.info("CASE 1 \"{}\" after urlEncoding is:\"{}\"",
                input, output);
        input = "               ";
        output = stringBuilderSolution.replaceSpaces(input,5);
        log.info("CASE 2 \"{}\" after urlEncoding is:\"{}\"",
                input, output);

        log.info("Start running solution: urlEncodeSpaceChar-CharArraySolution");
        CharArraySolution charArraySolution = new CharArraySolution();
        input = "Mr John Smith    ";
        output = charArraySolution.replaceSpaces(input,13);
        log.info("CASE 1 \"{}\" after urlEncoding is:\"{}\"",
                input, output);
        input = "               ";
        output = charArraySolution.replaceSpaces(input,5);
        log.info("CASE 2 \"{}\" after urlEncoding is:\"{}\"",
                input, output);

    }
}
