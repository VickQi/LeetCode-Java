package tech.qihaizhi.leetcode;

public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] pos1 = new int[26];
        for(int i=0;i<s1.length();i++){
            int j = s1.charAt(i) - 'a';
            pos1[j]++;
        }
        int[] pos2 = new int[26];
        for(int i=0;i<s2.length();i++){
            int j = s2.charAt(i) - 'a';
            pos2[j]++;
        }
        for(int i=0;i<pos1.length;i++){
            if(pos1[i]!=pos2[i]){
                return false;
            }
        }
        return true;
    }
}
