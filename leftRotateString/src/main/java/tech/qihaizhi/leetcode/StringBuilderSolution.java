package tech.qihaizhi.leetcode;

public class StringBuilderSolution {
    public String reverseLeftWords(String s, int n) {
        String strAfterRotation;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=n;i<s.length();i++){
            stringBuilder.append(s.charAt(i));
        }
        for(int i=0;i<n;i++){
            stringBuilder.append(s.charAt(i));
        }
        strAfterRotation = stringBuilder.toString();
        return strAfterRotation;
    }
}
