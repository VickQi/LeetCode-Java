package tech.qihaizhi.leetcode;

public class Solution {
    public int search(int[] nums, int target) {
        int occurTimes = 0;
        for(int i:nums){
            if(nums[i]==target){
                occurTimes++;
            }
            if(occurTimes>0&& nums[i]!=target){
                break;
            }
        }
        return occurTimes;
    }
}
