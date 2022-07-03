package tech.qihaizhi.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map_s = new HashMap<>();
        Map<Character,Character> map_t = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);
            if(map_s.get(sc)==null){
                if(map_t.get(tc)!=null && !map_t.get(tc).equals(sc)){
                    return false;
                }
                map_s.put(sc,tc);
                map_t.put(tc,sc);
            }else{
                if(!map_s.get(sc).equals(tc)){
                    return false;
                }
            }
        }
        return true;
    }
}
