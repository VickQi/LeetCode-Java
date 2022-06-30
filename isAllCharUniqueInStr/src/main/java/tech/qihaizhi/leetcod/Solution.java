package tech.qihaizhi.leetcod;

public class Solution {
    public boolean isUnique(String astr) {
        if(astr.length()>26){
            return false;
        }
        boolean result = true;
        int [] pos = new int[26];
        for(int i=0;i<astr.length();i++){
            int j = astr.charAt(i)-'a';
            if(pos[j]>0){
                result = false;
                break;
            }
            pos[j]++;
        }
        return result;
    }
}
