package tech.qihaizhi.leetcode;

public class CharArraySolution {
    /**
     * S: string to process
     * length: actual length of S, ignore the appending blanks
     * eg. S = "abc     ", length = 3, S.length()=8
     * */
    public String replaceSpaces(String S, int length) {
        char[] charArr = new char[length * 3];
        int j = 0;
        for(int i=0;i<length;i++){
            if(S.charAt(i)==' '){
                charArr[j] = '%';
                charArr[j+1] = '2';
                charArr[j+2] = '0';
                j+=3;
            }else{
                charArr[j] = S.charAt(i);
                j++;
            }
        }
        return new String(charArr,0, j);
    }
}
