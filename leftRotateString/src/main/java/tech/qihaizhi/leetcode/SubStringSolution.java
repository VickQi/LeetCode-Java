package tech.qihaizhi.leetcode;

public class SubStringSolution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }
}
