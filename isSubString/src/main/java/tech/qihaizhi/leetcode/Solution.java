package tech.qihaizhi.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()){
            return false;
        }
        int j = 0;
        int hits = 0;
        for(int i=0;i<s.length()&&j<t.length();i++){
            char searchFor = s.charAt(i);
            for(; j<t.length(); j++){
                if(searchFor == t.charAt(j)){
                    hits++;
                    j++;
                    break;
                }
            }
        }
        if(hits!=s.length()){
            return false;
        }
        return true;
    }
}
