package tech.qihaizhi.leetcode;

public class StringBuilderSolution {
    public String replaceSpaces(String S, int length) {
        char[] charArr = S.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<length;i++){
            if(charArr[i]==' '){
                result.append("%20");
            }else{
                result.append(charArr[i]);
            }
        }
        return result.toString();
    }
}
