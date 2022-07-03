package tech.qihaizhi.leetcode;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] pos = new int[nums.length];
        for( int i:nums ) {
            int tempNum = nums[i];
            if(pos[tempNum]>0){
                return tempNum;
            }
            pos[tempNum]++;
        }
        return -1;
    }
}
